package com.com3g.myPm.view.utils;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.com3g.myPm.domaine.Evaluation;
import com.com3g.myPm.domaine.types.SectionMypm;

@ManagedBean(name = "sessionBean")
@SessionScoped
public class SessionBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private SectionMypm selectedSection;
	private List<Evaluation> selectedListEval;

	public SectionMypm getSelectedSection() {
		return selectedSection;
	}

	public void setSelectedSection(SectionMypm selectedSection) {
		this.selectedSection = selectedSection;
	}

	public List<Evaluation> getSelectedListEval() {
		return selectedListEval;
	}

	public void setSelectedListEval(List<Evaluation> selectedListEval) {
		this.selectedListEval = selectedListEval;
	}

}
