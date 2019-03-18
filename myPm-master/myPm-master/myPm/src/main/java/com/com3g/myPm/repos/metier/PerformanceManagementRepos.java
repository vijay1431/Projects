package com.com3g.myPm.repos.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com3g.myPm.domaine.PerformanceManagement;

@Repository
public interface PerformanceManagementRepos extends JpaRepository<PerformanceManagement, Long> {

	public List<PerformanceManagement> findByEmployeUsername(String username);

	public List<PerformanceManagement> findByAppraisalsAppraisal(Integer appraisal);

	public PerformanceManagement findByAppraisalsAppraisalAndEmployeUsername(Integer appraisal, String username);

}
