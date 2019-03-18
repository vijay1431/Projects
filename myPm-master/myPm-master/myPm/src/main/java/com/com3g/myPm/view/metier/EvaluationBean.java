package com.com3g.myPm.view.metier;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.domaine.PerformanceManagement;
import com.com3g.myPm.service.metier.PerformanceManagementService;

@ManagedBean
@ViewScoped
public class EvaluationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private EGeneralData eGeneralData;

	@ManagedProperty(value = "#{performanceManagementService}")
	transient private PerformanceManagementService performanceManagementService;

	private PerformanceManagement performanceManagement = new PerformanceManagement();

	public EGeneralData geteGeneralData() {
		return eGeneralData;
	}

	public void seteGeneralData(EGeneralData eGeneralData) {
		this.eGeneralData = eGeneralData;
	}

	public void initPerformanceManagement(){
		performanceManagement = new PerformanceManagement();
	}
	
	public PerformanceManagement getPerformanceManagement() {
		if (eGeneralData != null)
			performanceManagement = getPerformanceManagementService().loadPerformanceMgmtClosedByUsername(eGeneralData.getUsername());
		return performanceManagement;
	}

	public void setPerformanceManagement(PerformanceManagement performanceManagement) {
		this.performanceManagement = performanceManagement;
	}

	public PerformanceManagementService getPerformanceManagementService() {
		return SpringJSFUtil.getBean("performanceManagementService");
	}

	public void setPerformanceManagementService(PerformanceManagementService performanceManagementService) {
		this.performanceManagementService = performanceManagementService;
	}

}
