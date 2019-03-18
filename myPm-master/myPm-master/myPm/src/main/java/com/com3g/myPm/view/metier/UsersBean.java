package com.com3g.myPm.view.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.Users;
import com.com3g.myPm.repos.metier.UsersRepos;
import com.com3g.myPm.view.utils.UserSessionBean;
@ManagedBean
@RequestScoped
public class UsersBean {
    private String firstname;
    private String lastname;
    private Users users;
    @ManagedProperty(value = "#{UsersRepos}")
    private UsersRepos repos;
    @ManagedProperty(value = "#{userSessionBean}")
    private UserSessionBean userSessionBean;
    public UserSessionBean getUserSessionBean() {
  	return userSessionBean;
      }

      public void setUserSessionBean(UserSessionBean userSessionBean) {
  	this.userSessionBean = userSessionBean;
      }
      public String getFirstname() {
	  users = repos.findByUsername(userSessionBean.getUsername());
	        return users.getFirstname();
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
		users = repos.findByUsername(userSessionBean.getUsername());
	        return users.getLastname();
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    public Users getUsers() {
	        return users;
	    }

	    public void setUsers(Users users) {
	        this.users = users;
	    }

	    public UsersRepos getRepos() {
	        return repos;
	    }

	    public void setRepos(UsersRepos repos) {
	        this.repos = repos;
	    }
      

}
