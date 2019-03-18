package com.com3g.myPm.domaine.types;

import java.io.Serializable;

public enum SectionMypm implements Serializable {

	/**
	 * Job execution
	 */
	JOB_EXECUTION("Job execution"),
	/**
	 * Personality attributes
	 */
	PERSONAL_ATTRIBUT("Personality attributes"),
	/**
	 * dependability
	 */
	LEADER_DEPEND("Leadership and dependability"),
	/**
	 * Management responsibilities
	 */
	MANAGMENT_RESP("Management responsibilities"),
	/**
	 * Code of conduct
	 */
	CODE_CONDUCT("Code of conduct");


	private String value;

	private SectionMypm(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
