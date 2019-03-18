package com.com3g.myPm.view.metier;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.service.metier.EGeneralDataService;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean(name="eGeneralDataBean")
@RequestScoped
public class EGeneralDataBean {

    @ManagedProperty(value = "#{userSessionBean}")
    private UserSessionBean userSessionBean;
    @ManagedProperty(value = "#{eGeneralDataService}")
    private EGeneralDataService eGeneralDataService;
    private EGeneralData eGeneralData;

    @PostConstruct
    public void init() {

	eGeneralData = eGeneralDataService.findOrganisatationel(userSessionBean.getUsername());

    }



    public UserSessionBean getUserSessionBean() {
	return userSessionBean;
    }

    public void setUserSessionBean(UserSessionBean userSessionBean) {
	this.userSessionBean = userSessionBean;
    }

    public EGeneralDataService geteGeneralDataService() {
	return eGeneralDataService;
    }

    public void seteGeneralDataService(EGeneralDataService eGeneralDataService) {
	this.eGeneralDataService = eGeneralDataService;
    }

    public EGeneralData geteGeneralData() {
	return eGeneralData;
    }

    public void seteGeneralData(EGeneralData eGeneralData) {
	this.eGeneralData = eGeneralData;
    }


}
