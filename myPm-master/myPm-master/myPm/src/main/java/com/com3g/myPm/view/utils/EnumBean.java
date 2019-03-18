package com.com3g.myPm.view.utils;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.com3g.myPm.domaine.types.SectionMypm;


@ApplicationScoped
@ManagedBean(name="enumBean")
public class EnumBean {

	public SectionMypm[] getSections() {
		return SectionMypm.values();
	}
}
