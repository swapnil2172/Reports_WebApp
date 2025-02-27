package com.reports.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="CITIZEN_PlAN_INFO")
public class CitizenPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String planName;
	private String planStatus;
	private String gender;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benfitAmt;
	private String rejectionRsn;
	private LocalDate terminateDate;
	private String terminateRsn;
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Double getBenfitAmt() {
		return benfitAmt;
	}
	public void setBenfitAmt(Double benfitAmt) {
		this.benfitAmt = benfitAmt;
	}
	public String getRejectionRsn() {
		return rejectionRsn;
	}
	public void setRejectionRsn(String rejectionRsn) {
		this.rejectionRsn = rejectionRsn;
	}
	public LocalDate getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(LocalDate terminateDate) {
		this.terminateDate = terminateDate;
	}
	public String getTerminateRsn() {
		return terminateRsn;
	}
	public void setTerminateRsn(String terminateRsn) {
		this.terminateRsn = terminateRsn;
	}
	
	


}
