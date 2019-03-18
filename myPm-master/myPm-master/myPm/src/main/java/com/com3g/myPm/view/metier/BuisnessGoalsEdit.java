package com.com3g.myPm.view.metier;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.com3g.myPm.domaine.BusinessGoals;
import com.com3g.myPm.service.metier.BusinessGoalsService;

@ManagedBean
@ViewScoped
public class BuisnessGoalsEdit implements Serializable {

	private BusinessGoals businessGoals = new BusinessGoals();

	private static BusinessGoalsService businessGoalsService() {
		return SpringJSFUtil.getBean("businessGoalsService");
	}

	public void confirm() {

		businessGoals.setStatus_Appraisal("Planning approuved by Manager");
		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public void confirmSummary() {

		businessGoals.setStatus_Appraisal("Summary approuved by Manager");
		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public void confirmMidyear() {

		businessGoals.setStatus_Appraisal("Mid year review approuved by Manager");
		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public void deleteBuisnessGoal() {

		businessGoalsService().delete(businessGoals);
	}

	public void saveBuisnessGoal() {

		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public void closeBuisnessGoal() {
		businessGoals.setStatus_Appraisal("Closed");
		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public void saveBuisnessGoalMidYear() {
		businessGoals.setStatus_Appraisal("Mid year review submited by employe");
		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public void saveBuisnessGoalSummary() {

		businessGoals.setStatus_Appraisal("Summary submited by employe");
		businessGoalsService().saveBusinessGoals(businessGoals);
	}

	public BusinessGoals getBusinessGoals() {
		return businessGoals;
	}

	public void setBusinessGoals(BusinessGoals businessGoals) {
		this.businessGoals = businessGoals;
	}

}
