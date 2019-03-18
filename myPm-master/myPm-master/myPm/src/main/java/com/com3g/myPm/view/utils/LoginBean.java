package com.com3g.myPm.view.utils;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.core.AuthenticationException;

import com.com3g.myPm.service.utils.AuthenticationService;


@ManagedBean
@RequestScoped
public class LoginBean {

    private String username;
    private String password;

    @ManagedProperty(value = "#{authenticationService}")
    private AuthenticationService authenticationService;

    public String doLogin() {
	try {
	    authenticationService.login(username, password);
	    return "accueil.xhtml?faces-redirect=true";
	} catch (AuthenticationException e) {
	    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Le mot de passe / nom d'utilisateur est erroné.",null));
	    return "index";
	}
    }

    public String doLogout() {
	authenticationService.logout();
	return "index";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    public void setAuthenticationService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    
}
