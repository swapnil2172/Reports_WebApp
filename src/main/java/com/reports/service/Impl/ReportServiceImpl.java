package com.reports.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.reports.dto.SearchDto;
import com.reports.entity.CitizenPlan;
import com.reports.repo.CitizenPlanRepository;
import com.reports.service.ReportService;

public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private CitizenPlanRepository planrepo;

	@Override
	public List<String> getPlanName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> getSearchRequest(SearchDto dto) {
		// TODO Auto-generated method stub
		return null;
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
