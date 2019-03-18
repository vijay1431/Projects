package com.com3g.myPm.view.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.context.SecurityContextHolder;

@SessionScoped
@ManagedBean
public class MenuBean {

    private String username;
    private String role;

    public String getUsername() {
	username = SecurityContextHolder.getContext().getAuthentication().getName();
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
	role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
}
