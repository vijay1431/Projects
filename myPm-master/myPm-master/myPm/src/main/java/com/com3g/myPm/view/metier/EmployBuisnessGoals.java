package com.com3g.myPm.view.metier;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.BusinessGoals;
import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.service.metier.AppraisalsService;
import com.com3g.myPm.service.metier.BusinessGoalsService;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean
@RequestScoped
public class EmployBuisnessGoals implements Serializable {
	
	@ManagedProperty(value = "#{businessGoalsService}")
	private BusinessGoalsService businessGoalsService;
    
	private static EGeneralData employ = new EGeneralData();
	


	private static List<BusinessGoals> businessGoalsOpen;
	
	public void init(){
		
		businessGoalsOpen = businessGoalsService.findByEmployeOpen(employ.getUsername());}

	public List<BusinessGoals> getBusinessGoalsOpen() {
		return businessGoalsOpen;
	}

	public void setBusinessGoalsOpen(List<BusinessGoals> businessGoalsOpen) {
		this.businessGoalsOpen = businessGoalsOpen;
	}

	public BusinessGoalsService getBusinessGoalsService() {
		return businessGoalsService;
	}

	public void setBusinessGoalsService(BusinessGoalsService businessGoalsService) {
		this.businessGoalsService = businessGoalsService;
	}


	public EGeneralData getEmploy() {
		return employ;
	}

	public void setEmploy(EGeneralData employ) {
		this.employ = employ;
		if(employ!=null){
		businessGoalsOpen = businessGoalsService.findByEmployeOpen(employ.getUsername());}
	}
	

}
