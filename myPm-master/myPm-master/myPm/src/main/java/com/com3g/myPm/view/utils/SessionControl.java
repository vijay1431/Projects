package com.com3g.myPm.view.utils;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import com.com3g.myPm.domaine.Authorities;

@ManagedBean
@RequestScoped
public class SessionControl {
	@ManagedProperty(value = "#{userSessionBean}")
	private UserSessionBean userSessionBean;
	private boolean contrHR = false;
    private Set<Authorities> list;

    @PostConstruct
    public void init(){
    	
		Set<Authorities> list = userSessionBean.getUserLoggedIn()
				.getAuthoritieses();
		System.out.println("size : "+list.size());
		for (Authorities authoritie : list) {
			if (authoritie.getId().getAuthority().equals("ROLE_HR")) {

				contrHR = true;

			}

		} 	
    	
    }

	public UserSessionBean getUserSessionBean() {
		return userSessionBean;
	}

	public void setUserSessionBean(UserSessionBean userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public boolean isContrHR() {
		return contrHR;
	}

	public void setContrHR(boolean contrHR) {
		this.contrHR = contrHR;
	}
	


}
