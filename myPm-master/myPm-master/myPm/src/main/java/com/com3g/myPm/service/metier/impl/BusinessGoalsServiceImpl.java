package com.com3g.myPm.service.metier.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.Affectation;
import com.com3g.myPm.domaine.BusinessGoals;
import com.com3g.myPm.repos.metier.AffectationRepos;
import com.com3g.myPm.repos.metier.BusinessGoalsRepos;
import com.com3g.myPm.repos.metier.UsersRepos;
import com.com3g.myPm.service.metier.BusinessGoalsService;
@Service ("businessGoalsService")
public class BusinessGoalsServiceImpl implements BusinessGoalsService {
    @Autowired
    BusinessGoalsRepos goalsRepos;
    @Autowired
    AffectationRepos affectationRepos;
    @Autowired
    UsersRepos usersRepos;
    @Override
    public void saveBusinessGoals(BusinessGoals businessGoals) {
	goalsRepos.save(businessGoals);

    }
	@Override
	public List<BusinessGoals> findByManager(String username) {
		List<Affectation> affectations;
		List<BusinessGoals> businessGoals;
		affectations = affectationRepos.findByUsersByUsersLm(username);
		for(Affectation affect:affectations){
//	à refaire	
//			goalsRepos.findByEmpAppriasals(affectationRepos.findByUsersByUsersLm(usersRepos.findOne()));	
		}
		return null;
	}
	
	@Override
	public List<BusinessGoals> findByEmployeOpen(String username) {
		List<BusinessGoals> businessGoals; 
		List<BusinessGoals> listToReturn = new ArrayList<BusinessGoals>();
		businessGoals =goalsRepos.findByEmploye(username);
		for(BusinessGoals busines:businessGoals){
			if(!((busines.getStatus_Appraisal()).equals("Closed")))
				listToReturn.add(busines);			
			
		}
		return listToReturn;
	}
	@Override
	public List<BusinessGoals> findByEmployeClosed(String username) {
		List<BusinessGoals> businessGoals; 
		List<BusinessGoals> listToReturn = new ArrayList<BusinessGoals>();
		businessGoals =goalsRepos.findByEmploye(username);
		for(BusinessGoals busines:businessGoals){
			if((busines.getStatus_Appraisal()).equals("Closed"))
				listToReturn.add(busines);			
			
		}
		return listToReturn;
	}
	@Override
	public void delete(BusinessGoals businessGoals) {
		goalsRepos.delete(businessGoals);
		
	}
	
}
