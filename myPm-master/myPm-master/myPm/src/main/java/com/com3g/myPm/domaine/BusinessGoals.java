package com.com3g.myPm.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "business_goals")
public class BusinessGoals implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idBusinessGolas;
	private int golasId;
	private String empAppriasals;
	private String employe;
	private String goalsTitle;
	private String goalsDetails;
	private Double goalWeight;
	private String midYearReview;
	@Column(name = "summary_review", length = 450)
	private String summaryReview;
	private Integer summaryRating;
	private String comment;
	private String status_Appraisal;

	public BusinessGoals() {
	}

	public BusinessGoals(int golasId, String empAppriasals, String employe, String goalsTitle, String goalsDetails,
			Double goalWeight, String midYearReview, Integer summaryRating, String status_Appraisal) {
		this.golasId = golasId;
		this.empAppriasals = empAppriasals;
		this.employe = employe;
		this.goalsTitle = goalsTitle;
		this.goalsDetails = goalsDetails;
		this.goalWeight = goalWeight;
		this.midYearReview = midYearReview;
		this.summaryRating = summaryRating;
		this.status_Appraisal = status_Appraisal;
	}

	public Long getIdBusinessGolas() {
		return this.idBusinessGolas;
	}

	public void setIdBusinessGolas(Long idBusinessGolas) {
		this.idBusinessGolas = idBusinessGolas;
	}

	@Column(name = "EmpAppriasals", nullable = false, length = 50)
	public String getEmpAppriasals() {
		return this.empAppriasals;
	}

	public void setEmpAppriasals(String empAppriasals) {
		this.empAppriasals = empAppriasals;
	}

	@Column(name = "Employe", nullable = false, length = 50)
	public String getEmploye() {
		return this.employe;
	}

	public void setEmploye(String employe) {
		this.employe = employe;
	}

	@Column(name = "Goals_Title", length = 100)
	public String getGoalsTitle() {
		return this.goalsTitle;
	}

	public void setGoalsTitle(String goalsTitle) {
		this.goalsTitle = goalsTitle;
	}

	@Column(name = "Goals_details", length = 450)
	public String getGoalsDetails() {
		return this.goalsDetails;
	}

	public void setGoalsDetails(String goalsDetails) {
		this.goalsDetails = goalsDetails;
	}

	@Column(name = "Goal_Weight", precision = 22, scale = 0)
	public Double getGoalWeight() {
		return this.goalWeight;
	}

	public void setGoalWeight(Double goalWeight) {
		this.goalWeight = goalWeight;
	}

	@Column(name = "Mid_Year_Review", length = 50)
	public String getMidYearReview() {
		return this.midYearReview;
	}

	public void setMidYearReview(String midYearReview) {
		this.midYearReview = midYearReview;
	}

	@Column(name = "status_Appraisal", nullable = false, length = 50)
	public String getStatus_Appraisal() {
		return status_Appraisal;
	}

	public void setStatus_Appraisal(String status_Appraisal) {
		this.status_Appraisal = status_Appraisal;
	}

	@Column(name = "Summary_rating")
	public Integer getSummaryRating() {
		return this.summaryRating;
	}

	public void setSummaryRating(Integer summaryRating) {
		this.summaryRating = summaryRating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getGolasId() {
		return golasId;
	}

	public void setGolasId(int golasId) {
		this.golasId = golasId;
	}

	public String getSummaryReview() {
		return summaryReview;
	}

	public void setSummaryReview(String summaryReview) {
		this.summaryReview = summaryReview;
	}

}
