package com.reports.service.Impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import com.reports.dto.SearchDto;
import com.reports.entity.CitizenPlan;
import com.reports.repo.CitizenPlanRepository;
import com.reports.service.ReportService;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

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
	public boolean exportExcel(HttpServletResponse response) throws Exception {
		
		Workbook workbook=new HSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("plans_data");
		Row rowheader = sheet.createRow(0);
		rowheader.createCell(0).setCellValue("ID");
		rowheader.createCell(1).setCellValue("Citizen Name");
		rowheader.createCell(2).setCellValue("Plan Name");
		rowheader.createCell(3).setCellValue("Plan Status");
		rowheader.createCell(4).setCellValue("Gender");
		rowheader.createCell(5).setCellValue("Plan Start Date");
		rowheader.createCell(6).setCellValue("Plan End Date");
		
		List<CitizenPlan> plandata = planrepo.findAll();
		int row=1;
		
		for (CitizenPlan data : plandata) {
			Row rows = sheet.createRow(row);
			rows.createCell(0).setCellValue(data.getCitizenId());
			rows.createCell(1).setCellValue(data.getCitizenName());
			rows.createCell(2).setCellValue(data.getPlanName());
			rows.createCell(3).setCellValue(data.getPlanStatus());
			rows.createCell(4).setCellValue(data.getGender());
			rows.createCell(5).setCellValue(data.getPlanStartDate());
			rows.createCell(6).setCellValue(data.getPlanEndDate());
			row++;
		}
		
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
		
		
		return false;
	}

	@Override
	public boolean exportPdf(HttpServletResponse response) throws Exception {
		
		Document document =new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		
		document.open();
		Paragraph p=new Paragraph("Citizen Plans");
		p.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(p);
		
		PdfPTable table=new PdfPTable(6);
		table.setSpacingBefore(5);
		table.addCell("ID");
		table.addCell("Citizen Name");
		table.addCell("Plan Name");
		table.addCell("Plan Status");
		table.addCell("Start Date");
		table.addCell("End Date");
		
		
		List<CitizenPlan> plans = planrepo.findAll();
		
		for (CitizenPlan plan : plans) {
			
			table.addCell(String.valueOf(plan.getCitizenId()));
			table.addCell(plan.getCitizenName());
			table.addCell(plan.getPlanName());
			table.addCell(plan.getPlanStatus());
			table.addCell(plan.getPlanStartDate()+"");
			table.addCell(plan.getPlanEndDate()+"");
			
		}
		
		
		document.add(table);
		document.close();
		
		return true;
	}

}
