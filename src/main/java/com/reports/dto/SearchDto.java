package com.reports.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchDto {
	
	private String planName;
	private String planStatus;
	private String gender;
	private String startDate;
	private String endDate;
	

	
}
