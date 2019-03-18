package com.com3g.myPm.view.metier;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.com3g.myPm.domaine.Appraisals;
import com.com3g.myPm.service.metier.AppraisalsService;

@ManagedBean
@ViewScoped
public class AppraisalsEditBean implements Serializable {

	
	private static AppraisalsService appraisalsService() {
        return SpringJSFUtil.getBean("appraisalsService");
    }
	
	private Appraisals appraisals;

	public void deleteAppraisalSession() {
		appraisalsService().deleteAppraisal(appraisals);
	}
	
	


	public Appraisals getAppraisals() {
		return appraisals;
	}

	public void setAppraisals(Appraisals appraisals) {
		this.appraisals = appraisals;
	}
	
	public void save(){
		
		appraisalsService().saveApprialsal(appraisals);
		
	}

}
