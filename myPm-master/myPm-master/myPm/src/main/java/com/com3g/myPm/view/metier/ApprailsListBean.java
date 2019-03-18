package com.com3g.myPm.view.metier;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.Appraisals;
import com.com3g.myPm.service.metier.AppraisalsService;

@ManagedBean
@RequestScoped
public class ApprailsListBean implements Serializable{
	

	private List<Appraisals> appraisalsList;

	@ManagedProperty(value = "#{appraisalsService}")
	private AppraisalsService appraisalsService;
	
	@PostConstruct
	public void init(){
		
		appraisalsList = appraisalsService.findAllAppraisals();
	}
	
	
	public List<Appraisals> getAppraisalsList() {
		return appraisalsList;
	}
	public void setAppraisalsList(List<Appraisals> appraisalsList) {
		this.appraisalsList = appraisalsList;
	}
	
	public AppraisalsService getAppraisalsService() {
		return appraisalsService;
	}


	public void setAppraisalsService(AppraisalsService appraisalsService) {
		this.appraisalsService = appraisalsService;
	}
	

}
