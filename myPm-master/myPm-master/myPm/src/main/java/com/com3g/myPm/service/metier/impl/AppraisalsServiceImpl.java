package com.com3g.myPm.service.metier.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.Appraisals;
import com.com3g.myPm.repos.metier.AppraisalsRepos;
import com.com3g.myPm.service.metier.AppraisalsService;

@Service("appraisalsService")
public class AppraisalsServiceImpl implements AppraisalsService {
	@Autowired
	AppraisalsRepos appraisalsRepos;

	@Override
	public void saveApprialsal(Appraisals appraisals) {

		appraisalsRepos.save(appraisals);

	}
	
	@Override
	public int getYearOpen() {
		int yearOpen =0;
		List<Appraisals> appraisals;
		appraisals =appraisalsRepos.findAll();
		for(Appraisals appr:appraisals){
			if((appr.getStatus()).equals("Open"))
				yearOpen =appr.getYear();
		}
		return yearOpen;
	}

	@Override
	public List<Appraisals> findAllAppraisals() {

		return appraisalsRepos.findAll();
	}

	@Override
	public void deleteAppraisal(Appraisals appraisals) {
		appraisalsRepos.delete(appraisals);
		
	}

}
