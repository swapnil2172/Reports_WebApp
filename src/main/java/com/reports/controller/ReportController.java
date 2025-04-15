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
}
