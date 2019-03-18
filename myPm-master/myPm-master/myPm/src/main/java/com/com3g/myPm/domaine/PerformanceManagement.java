package com.com3g.myPm.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PerformanceManagement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Users employe;
	@OneToMany
	private List<Evaluation> evaluations = new ArrayList<Evaluation>();
	@ManyToOne
	private Appraisals appraisals;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<SectionMypm> sections = new ArrayList<SectionMypm>();

	private String status;

	private Integer JobExecutionRating;
	private Integer ManagementRespRating;
	private Integer CodeConductRating;
	private Integer LeaderDependRating;
	private Integer PersonalAttriRating;

	private Integer summaryRating;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getEmploye() {
		return employe;
	}

	public void setEmploye(Users employe) {
		this.employe = employe;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Integer getJobExecutionRating() {
		return JobExecutionRating;
	}

	public void setJobExecutionRating(Integer jobExecutionRating) {
		JobExecutionRating = jobExecutionRating;
	}

	public Integer getManagementRespRating() {
		return ManagementRespRating;
	}

	public void setManagementRespRating(Integer managementRespRating) {
		ManagementRespRating = managementRespRating;
	}

	public Integer getCodeConductRating() {
		return CodeConductRating;
	}

	public void setCodeConductRating(Integer codeConductRating) {
		CodeConductRating = codeConductRating;
	}

	public Integer getLeaderDependRating() {
		return LeaderDependRating;
	}

	public void setLeaderDependRating(Integer leaderDependRating) {
		LeaderDependRating = leaderDependRating;
	}

	public Integer getPersonalAttriRating() {
		return PersonalAttriRating;
	}

	public void setPersonalAttriRating(Integer personalAttriRating) {
		PersonalAttriRating = personalAttriRating;
	}

	public Integer getSummaryRating() {
		return summaryRating;
	}

	public void setSummaryRating(Integer summaryRating) {
		this.summaryRating = summaryRating;
	}

	public Appraisals getAppraisals() {
		return appraisals;
	}

	public void setAppraisals(Appraisals appraisals) {
		this.appraisals = appraisals;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<SectionMypm> getSections() {
		return sections;
	}

	public void setSections(List<SectionMypm> sections) {
		this.sections = sections;
	}

}
