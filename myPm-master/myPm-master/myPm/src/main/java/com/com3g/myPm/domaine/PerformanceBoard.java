package com.com3g.myPm.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.com3g.myPm.domaine.types.SectionMypm;

@Entity
public class PerformanceBoard implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private int idCritere;
	private String title;
	 @Column(length = 450)
	private String details;
	@Enumerated
	private SectionMypm section;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public SectionMypm getSection() {
		return section;
	}

	public void setSection(SectionMypm section) {
		this.section = section;
	}

	public int getIdCritere() {
		return idCritere;
	}

	public void setIdCritere(int idCritere) {
		this.idCritere = idCritere;
	}

}
