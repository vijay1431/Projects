package com.com3g.myPm.domaine;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "appraisals")
public class Appraisals implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer appraisal;
    private int year;
    private String status;
	private Date startDate;
    private Date endDate;
    private Date planningStartDate;
    private Date planningEndDate;
    private Date midYearReviewStartDate;
    private Date midYearReviewEndDate;
    private Date endYearSummaryStartDate;
    private Date endYearSummaryEndDate;

    public Appraisals() {
    }

    public Appraisals(int year, String status , Date startDate, Date endDate, Date planningStartDate, Date planningEndDate,
	    Date midYearReviewStartDate, Date midYearReviewEndDate, Date endYearSummaryStartDate,
	    Date endYearSummaryEndDate) {
	this.year = year;
	this.status = status;
	this.startDate = startDate;
	this.endDate = endDate;
	this.planningStartDate = planningStartDate;
	this.planningEndDate = planningEndDate;
	this.midYearReviewStartDate = midYearReviewStartDate;
	this.midYearReviewEndDate = midYearReviewEndDate;
	this.endYearSummaryStartDate = endYearSummaryStartDate;
	this.endYearSummaryEndDate = endYearSummaryEndDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Appraisal", unique = true, nullable = false)
    public Integer getAppraisal() {
	return this.appraisal;
    }

    public void setAppraisal(Integer appraisal) {
	this.appraisal = appraisal;
    }

    @Column(name = "Year", nullable = false)
    public int getYear() {
	return this.year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Start_Date", nullable = false, length = 10)
    public Date getStartDate() {
	return this.startDate;
    }

    public void setStartDate(Date startDate) {
	this.startDate = startDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "End_date", nullable = false, length = 10)
    public Date getEndDate() {
	return this.endDate;
    }

    public void setEndDate(Date endDate) {
	this.endDate = endDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Planning_Start_Date", nullable = false, length = 10)
    public Date getPlanningStartDate() {
	return this.planningStartDate;
    }

    public void setPlanningStartDate(Date planningStartDate) {
	this.planningStartDate = planningStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Planning_end_date", nullable = false, length = 10)
    public Date getPlanningEndDate() {
	return this.planningEndDate;
    }

    public void setPlanningEndDate(Date planningEndDate) {
	this.planningEndDate = planningEndDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Mid_Year_Review_Start_Date", nullable = false, length = 10)
    public Date getMidYearReviewStartDate() {
	return this.midYearReviewStartDate;
    }

    public void setMidYearReviewStartDate(Date midYearReviewStartDate) {
	this.midYearReviewStartDate = midYearReviewStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Mid_Year_Review_end_Date", nullable = false, length = 10)
    public Date getMidYearReviewEndDate() {
	return this.midYearReviewEndDate;
    }

    public void setMidYearReviewEndDate(Date midYearReviewEndDate) {
	this.midYearReviewEndDate = midYearReviewEndDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "End_Year_summary_start_date", nullable = false, length = 10)
    public Date getEndYearSummaryStartDate() {
	return this.endYearSummaryStartDate;
    }

    public void setEndYearSummaryStartDate(Date endYearSummaryStartDate) {
	this.endYearSummaryStartDate = endYearSummaryStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "End_Year_summary_end_date", nullable = false, length = 10)
    public Date getEndYearSummaryEndDate() {
	return this.endYearSummaryEndDate;
    }

    public void setEndYearSummaryEndDate(Date endYearSummaryEndDate) {
	this.endYearSummaryEndDate = endYearSummaryEndDate;
    }
    
    @Column(name = "STATUS", nullable = false, length = 100)
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
