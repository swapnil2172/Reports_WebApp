package com.reports.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reports.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
	
	@Query("select distinct(planName) from CitizenPlan")
	List<String> getPlanName();
	
	@Query("select distinct(planStatus) from CitizenPlan")
	List<String> getPlanStatus();
	

}
