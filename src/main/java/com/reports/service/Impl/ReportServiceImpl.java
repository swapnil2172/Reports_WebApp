package com.reports.service.Impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.reports.dto.SearchDto;
import com.reports.entity.CitizenPlan;
import com.reports.repo.CitizenPlanRepository;
import com.reports.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private CitizenPlanRepository planrepo;

	@Override
	public List<String> getPlanName() {
		return planrepo.getPlanName();
	}

	@Override
	public List<String> getPlanStatus() {
		return planrepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> getSearchRequest(SearchDto dto) {
		
		CitizenPlan entity= new CitizenPlan();
		
		if(null!=dto.getPlanName() && !"".equals(dto.getPlanName())) {
			entity.setPlanName(dto.getPlanName());
		}
		
		if(null!=dto.getPlanStatus() && !"".equals(dto.getPlanStatus())) {
			entity.setPlanStatus(dto.getPlanStatus());
		}
		
		if(null!=dto.getGender() && !"".equals(dto.getGender())) {
			entity.setGender(dto.getGender());
		}
		
		if(null!=dto.getStartDate() && !"".equals(dto.getStartDate())){
			String startDate = dto.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localDate = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localDate);
		}
		
		if(null!=dto.getEndDate() && !"".equals(dto.getEndDate())){
			String EndDate = dto.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate localDate = LocalDate.parse(EndDate, formatter);
			entity.setPlanEndDate(localDate);
		}
		
		return planrepo.findAll(Example.of(entity));
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
