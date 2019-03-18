package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.Appraisals;

public interface AppraisalsRepos  extends JpaRepository<Appraisals, Long>{
    
	public Appraisals findByStatus(String status);
}
