package com.com3g.myPm.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SectionMypm implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Enumerated
	private com.com3g.myPm.domaine.types.SectionMypm section;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public com.com3g.myPm.domaine.types.SectionMypm getSection() {
		return section;
	}

	public void setSection(com.com3g.myPm.domaine.types.SectionMypm section) {
		this.section = section;
	}

}
