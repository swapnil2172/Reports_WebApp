package com.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.reports.dto.SearchDto;
import com.reports.entity.CitizenPlan;
import com.reports.service.ReportService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ReportController {

	@Autowired
	private ReportService reportservice;

	@GetMapping("/")
	public String getRequest(Model model) {
		model.addAttribute("search", new SearchDto());
		init(model);

		return "index";
	}

	private void init(Model model) {
		model.addAttribute("names", reportservice.getPlanName());
		model.addAttribute("status", reportservice.getPlanStatus());
	}
	
	@PostMapping("/search")
	public String handleSearch ( SearchDto searchobj, Model model) {
		List<CitizenPlan> plans = reportservice.getSearchRequest(searchobj);
		model.addAttribute("plans", plans);
		model.addAttribute("search", searchobj);
		init(model);
		return "index";
	}
	
	@GetMapping("/excel")
	public void exportExcel (HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=plans.xls");
		reportservice.exportExcel(response);
	}
	
	@GetMapping("/pdf")
	public void exportPdf(HttpServletResponse response) throws Exception{
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment;filename=plans.pdf");
		reportservice.exportPdf(response);
	}
}
