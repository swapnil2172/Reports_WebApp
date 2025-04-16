package com.reports.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.reports.dto.SearchDto;
import com.reports.entity.CitizenPlan;

import jakarta.servlet.http.HttpServletResponse;

public interface ReportService {

	public List<String> getPlanName();

	public List<String> getPlanStatus();

	public List<CitizenPlan> getSearchRequest(SearchDto dto);

	public boolean exportExcel(HttpServletResponse response) throws  Exception;

	public boolean exportPdf(HttpServletResponse response) throws Exception;
}
