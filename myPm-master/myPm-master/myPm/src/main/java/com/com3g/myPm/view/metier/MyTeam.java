package com.com3g.myPm.view.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.service.metier.AffectationService;
import com.com3g.myPm.service.metier.BusinessGoalsService;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean
@ViewScoped
public class MyTeam implements Serializable{

	private List<EGeneralData> myteam = new ArrayList<EGeneralData>();
	

	
	private static UserSessionBean userSessionBean() {
		return SpringJSFUtil.getBean("userSessionBean");
	}
	private static AffectationService affectationService() {
		return SpringJSFUtil.getBean("affectationService");
	}
	
	public String redirect(){
		
		return "MyTeamEmployOngoingAppraisal?faces-redirect=true";
	}
	
	@PostConstruct
	public void init(){
		myteam 	= affectationService().getbyManager(userSessionBean().getUsername());
	}

	public List<EGeneralData> getMyteam() {
		return myteam;
	}

	public void setMyteam(List<EGeneralData> myteam) {
		this.myteam = myteam;
	}

}
