package com.com3g.myPm.view.metier;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import javax.faces.bean.SessionScoped;

import com.com3g.myPm.domaine.Appraisals;
import com.com3g.myPm.service.metier.AppraisalsService;

@ManagedBean(name = "appraisalsBean")
@RequestScoped
public class AppraisalsBean {

	@ManagedProperty(value = "#{appraisalsService}")
	private AppraisalsService appraisalsService;

    private Appraisals appraisals = new Appraisals();
	
	public AppraisalsBean() {

	}

	public String SaveAppraisalss() {
		System.out.println("app : "+appraisals.getYear());
		appraisalsService.saveApprialsal(appraisals);
		return "session?faces-redirect=true";
	}

	public Appraisals getAppraisals() {
		return appraisals;
	}

	public void setAppraisals(Appraisals appraisals) {
		this.appraisals = appraisals;
	}


	public AppraisalsService getAppraisalsService() {
		return appraisalsService;
	}

	public void setAppraisalsService(AppraisalsService appraisalsService) {
		this.appraisalsService = appraisalsService;
	}

}
