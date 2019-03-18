package com.com3g.myPm.repos.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.EmployeAppraisals;

public interface EmployeAppraisalsRepos  extends JpaRepository<EmployeAppraisals, Long>{
    
    public List<EmployeAppraisals> findByEmploye(String username);
}
