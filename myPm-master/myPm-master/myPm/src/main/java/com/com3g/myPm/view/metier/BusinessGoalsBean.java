package com.com3g.myPm.view.metier;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import com.com3g.myPm.domaine.BusinessGoals;

import com.com3g.myPm.service.metier.AppraisalsService;
import com.com3g.myPm.service.metier.BusinessGoalsService;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean(name = "businessGoalsBean")
@RequestScoped
public class BusinessGoalsBean {

	@ManagedProperty(value = "#{businessGoalsService}")
	private BusinessGoalsService businessGoalsService;
	@ManagedProperty(value = "#{appraisalsService}")
	private AppraisalsService appraisalsService;
	@ManagedProperty(value = "#{userSessionBean}")
	private UserSessionBean userSessionBean;
	
	private BusinessGoals businessGoals = new BusinessGoals();


	private List<BusinessGoals> businessGoalsOpen;
	private List<BusinessGoals> businessGoalsClosed;


	public String SaveBusinessGoals() {
		businessGoals.setEmpAppriasals((userSessionBean.getUsername()) + "_" + (appraisalsService.getYearOpen()));
		businessGoals.setEmploye(userSessionBean.getUsername());
		businessGoals.setStatus_Appraisal("Planning submited to Manager");
//		businessGoals.setGoalWeight(goalWeight);
		businessGoalsService.saveBusinessGoals(businessGoals);
		return "OngoingAppraisal?faces-redirect=true";
	}

	@PostConstruct
	public void init() {
		businessGoalsOpen = businessGoalsService
				.findByEmployeOpen(userSessionBean.getUsername());
		businessGoalsClosed = businessGoalsService
				.findByEmployeClosed(userSessionBean.getUsername());
	}

	public UserSessionBean getUserSessionBean() {
		return userSessionBean;
	}

	public void setUserSessionBean(UserSessionBean userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	
	public BusinessGoalsService getBusinessGoalsService() {
		return businessGoalsService;
	}

	public void setBusinessGoalsService(
			BusinessGoalsService businessGoalsService) {
		this.businessGoalsService = businessGoalsService;
	}

	public AppraisalsService getAppraisalsService() {
		return appraisalsService;
	}

	public void setAppraisalsService(AppraisalsService appraisalsService) {
		this.appraisalsService = appraisalsService;
	}

	public List<BusinessGoals> getBusinessGoalsOpen() {
		businessGoalsOpen = businessGoalsService.findByEmployeOpen(userSessionBean.getUsername());
		return businessGoalsOpen;
	}

	public void setBusinessGoalsOpen(List<BusinessGoals> businessGoalsOpen) {
		this.businessGoalsOpen = businessGoalsOpen;
	}

	public List<BusinessGoals> getBusinessGoalsClosed() {
		return businessGoalsClosed;
	}

	public void setBusinessGoalsClosed(List<BusinessGoals> businessGoalsClosed) {
		this.businessGoalsClosed = businessGoalsClosed;
	}
	

	public BusinessGoals getBusinessGoals() {
		return businessGoals;
	}

	public void setBusinessGoals(BusinessGoals businessGoals) {
		this.businessGoals = businessGoals;
	}

}
