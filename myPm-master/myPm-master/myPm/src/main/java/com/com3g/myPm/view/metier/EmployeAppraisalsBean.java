package com.com3g.myPm.view.metier;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.EmployeAppraisals;
import com.com3g.myPm.service.metier.EmployeAppraisalsService;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean
@RequestScoped
public class EmployeAppraisalsBean {

    @ManagedProperty(value = "#{userSessionBean}")
    private UserSessionBean userSessionBean;

    @ManagedProperty(value = "#{employeAppraisalsService}")
    private EmployeAppraisalsService employeAppraisalsService;

    private List<EmployeAppraisals> employeAppraisalsList;

    public UserSessionBean getUserSessionBean() {
	return userSessionBean;
    }

    public void setUserSessionBean(UserSessionBean userSessionBean) {
	this.userSessionBean = userSessionBean;
    }

    public List<EmployeAppraisals> getEmployeAppraisalsList() {
	employeAppraisalsList = employeAppraisalsService.findByUsername(userSessionBean.getUsername());
	return employeAppraisalsList;
    }

    public void setEmployeAppraisalsList(List<EmployeAppraisals> employeAppraisalsList) {
	this.employeAppraisalsList = employeAppraisalsList;
    }

}
