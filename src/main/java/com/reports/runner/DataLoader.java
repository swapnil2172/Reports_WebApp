package com.reports.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.reports.entity.CitizenPlan;
import com.reports.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("swapnil");
		c1.setPlanName("Cash");
		c1.setPlanStatus("approved");
		c1.setGender("Male");
		c1.setPlanStartDate(LocalDate.now().minusMonths(1));
		c1.setPlanEndDate(LocalDate.now().plusMonths(5));
		c1.setBenfitAmt(5000.0);
		
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Nisha");
		c2.setPlanName("Cash");
		c2.setPlanStatus("approved");
		c2.setGender("FeMale");
		c2.setPlanStartDate(LocalDate.now().minusMonths(1));
		c2.setPlanEndDate(LocalDate.now().plusMonths(5));
		c2.setBenfitAmt(6000.0);
		
		CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Yash");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Denial");
		c3.setGender("Male");
		c3.setRejectionRsn("Money Problem");
		
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("Eliza");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Denial");
		c4.setGender("FeMale");
		c4.setRejectionRsn("Money Problem");
		
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Pramod");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Terminated");
		c5.setGender("Male");
		c5.setTerminateDate(LocalDate.now().minusMonths(2));
		c5.setTerminateRsn("Got a Job");
		c5.setBenfitAmt(2000.0);
		
		
		CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Aunty");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setGender("FeMale");
		c6.setTerminateDate(LocalDate.now().minusMonths(2));
		c6.setTerminateRsn("Got a Work");
		c6.setBenfitAmt(3000.0);
		
		CitizenPlan c7=new CitizenPlan();
		c7.setCitizenName("Sachin");
		c7.setPlanName("food");
		c7.setPlanStatus("approved");
		c7.setGender("Male");
		c7.setPlanStartDate(LocalDate.now().minusMonths(1));
		c7.setPlanEndDate(LocalDate.now().plusMonths(5));
		c7.setBenfitAmt(7000.0);
		
		CitizenPlan c8=new CitizenPlan();
		c8.setCitizenName("Apurva");
		c8.setPlanName("food");
		c8.setPlanStatus("approved");
		c8.setGender("FeMale");
		c8.setPlanStartDate(LocalDate.now().minusMonths(1));
		c8.setPlanEndDate(LocalDate.now().plusMonths(5));
		c8.setBenfitAmt(8000.0);
		
		CitizenPlan c9=new CitizenPlan();
		c9.setCitizenName("Zende");
		c9.setPlanName("food");
		c9.setPlanStatus("Denial");
		c9.setGender("Male");
		c9.setRejectionRsn("Money Problem");
		
		CitizenPlan c10=new CitizenPlan();
		c10.setCitizenName("zubby");
		c10.setPlanName("food");
		c10.setPlanStatus("Denial");
		c10.setGender("FeMale");
		c10.setRejectionRsn("Money Problem");
		
		CitizenPlan c11=new CitizenPlan();
		c11.setCitizenName("vishal");
		c11.setPlanName("food");
		c11.setPlanStatus("Terminated");
		c11.setGender("Male");
		c11.setTerminateDate(LocalDate.now().minusMonths(2));
		c11.setTerminateRsn("Got a Job");
		c11.setBenfitAmt(9000.0);
		
		
		CitizenPlan c12=new CitizenPlan();
		c12.setCitizenName("Vaishu");
		c12.setPlanName("food");
		c12.setPlanStatus("Terminated");
		c12.setGender("FeMale");
		c12.setTerminateDate(LocalDate.now().minusMonths(2));
		c12.setTerminateRsn("Got a Work");
		c12.setBenfitAmt(10000.0);

		
		CitizenPlan c13=new CitizenPlan();
		c13.setCitizenName("Sanjay");
		c13.setPlanName("medical");
		c13.setPlanStatus("approved");
		c13.setGender("Male");
		c13.setPlanStartDate(LocalDate.now().minusMonths(1));
		c13.setPlanEndDate(LocalDate.now().plusMonths(5));
		c13.setBenfitAmt(11000.0);
		
		CitizenPlan c14=new CitizenPlan();
		c14.setCitizenName("Neeta");
		c14.setPlanName("medical");
		c14.setPlanStatus("approved");
		c14.setGender("FeMale");
		c14.setPlanStartDate(LocalDate.now().minusMonths(1));
		c14.setPlanEndDate(LocalDate.now().plusMonths(5));
		c14.setBenfitAmt(12000.0);
		
		CitizenPlan c15=new CitizenPlan();
		c15.setCitizenName("Suraj");
		c15.setPlanName("medical");
		c15.setPlanStatus("Denial");
		c15.setGender("Male");
		c15.setRejectionRsn("Money Problem");
		
		CitizenPlan c16=new CitizenPlan();
		c16.setCitizenName("Shraddha");
		c16.setPlanName("medical");
		c16.setPlanStatus("Denial");
		c16.setGender("FeMale");
		c16.setRejectionRsn("Money Problem");
		
		CitizenPlan c17=new CitizenPlan();
		c17.setCitizenName("Chetan");
		c17.setPlanName("medical");
		c17.setPlanStatus("Terminated");
		c17.setGender("Male");
		c17.setTerminateDate(LocalDate.now().minusMonths(2));
		c17.setTerminateRsn("Got a Job");
		c17.setBenfitAmt(12000.0);
		
		
		CitizenPlan c18=new CitizenPlan();
		c18.setCitizenName("shanno");
		c18.setPlanName("medical");
		c18.setPlanStatus("Terminated");
		c18.setGender("FeMale");
		c18.setTerminateDate(LocalDate.now().minusMonths(2));
		c18.setTerminateRsn("Got a Work");
		c18.setBenfitAmt(10000.0);
		
		CitizenPlan c19=new CitizenPlan();
		c19.setCitizenName("Prem");
		c19.setPlanName("Employement");
		c19.setPlanStatus("approved");
		c19.setGender("Male");
		c19.setPlanStartDate(LocalDate.now().minusMonths(1));
		c19.setPlanEndDate(LocalDate.now().plusMonths(5));
		c19.setBenfitAmt(13000.0);
		
		CitizenPlan c20=new CitizenPlan();
		c20.setCitizenName("Pragati");
		c20.setPlanName("Employement");
		c20.setPlanStatus("approved");
		c20.setGender("FeMale");
		c20.setPlanStartDate(LocalDate.now().minusMonths(1));
		c20.setPlanEndDate(LocalDate.now().plusMonths(5));
		c20.setBenfitAmt(14000.0);
		
		CitizenPlan c21=new CitizenPlan();
		c21.setCitizenName("Ravi");
		c21.setPlanName("Employement");
		c21.setPlanStatus("Denial");
		c21.setGender("Male");
		c21.setRejectionRsn("Money Problem");
		
		CitizenPlan c22=new CitizenPlan();
		c22.setCitizenName("Gayatri");
		c22.setPlanName("Employement");
		c22.setPlanStatus("Denial");
		c22.setGender("FeMale");
		c22.setRejectionRsn("Money Problem");
		
		CitizenPlan c23=new CitizenPlan();
		c23.setCitizenName("Baba");
		c23.setPlanName("Employement");
		c23.setPlanStatus("Terminated");
		c23.setGender("Male");
		c23.setTerminateDate(LocalDate.now().minusMonths(2));
		c23.setTerminateRsn("Got a Job");
		c23.setBenfitAmt(15000.0);
		
		
		CitizenPlan c24=new CitizenPlan();
		c24.setCitizenName("Girija");
		c24.setPlanName("Employement");
		c24.setPlanStatus("Terminated");
		c24.setGender("FeMale");
		c24.setTerminateDate(LocalDate.now().minusMonths(2));
		c24.setTerminateRsn("Got a Work");
		c24.setBenfitAmt(16000.0);
		
		
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24);
		repo.saveAll(list);
	}
}
