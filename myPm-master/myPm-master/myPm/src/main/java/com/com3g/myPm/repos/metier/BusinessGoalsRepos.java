package com.com3g.myPm.repos.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.BusinessGoals;


public interface BusinessGoalsRepos  extends JpaRepository<BusinessGoals,Long>{
	public List<BusinessGoals> findByEmpAppriasals(String empAppriasals);
    public List<BusinessGoals> findByEmploye(String username);
}
