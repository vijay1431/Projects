package com.com3g.myPm.view.utils;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.context.SecurityContextHolder;

import com.com3g.myPm.domaine.Users;
import com.com3g.myPm.repos.metier.UsersRepos;

@ManagedBean
@SessionScoped
public class UserSessionBean implements Serializable {

	private String username;
	private String selectedUsername;

	private Users userLoggedIn = new Users();
	@ManagedProperty(value = "#{usersRepos}")
	private UsersRepos userRepos;

	public Users getUserLoggedIn() {
		username = SecurityContextHolder.getContext().getAuthentication().getName();

		userLoggedIn = userRepos.findByUsername(username);

		return userLoggedIn;
	}

	public void setUserLoggedIn(Users user) {
		this.userLoggedIn = user;
	}

	public String getUsername() {
		if (username == null || "".equals(username))
			username = SecurityContextHolder.getContext().getAuthentication().getName();
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UsersRepos getUserRepos() {
		return userRepos;
	}

	public void setUserRepos(UsersRepos userRepos) {
		this.userRepos = userRepos;
	}

	public String getSelectedUsername() {
		return selectedUsername;
	}

	public void setSelectedUsername(String selectedUser) {
		this.selectedUsername = selectedUser;
	}

}
