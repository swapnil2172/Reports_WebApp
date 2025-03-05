package com.reports.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reports.dto.SearchDto;
import com.reports.entity.CitizenPlan;

@Service
public interface ReportService {

	public List<String> getPlanName();

	public List<String> getPlanStatus();

	public List<CitizenPlan> getSearchRequest(SearchDto dto);

	public boolean exportExcel();

	public boolean exportPdf();
}
