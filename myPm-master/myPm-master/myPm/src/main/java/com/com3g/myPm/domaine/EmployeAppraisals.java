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
@Table(name = "employe_appraisals")
public class EmployeAppraisals implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Long idEmpAppriasals;
    private String employe;
    private String apparaisee;
    private int apparaisal;
    private String status_Appraisal;
    private Date date;

    public EmployeAppraisals() {
    }

    public EmployeAppraisals(String employe, String apparaisee, int apparaisal, String status_Appraisal, Date date) {
	this.employe = employe;
	this.apparaisee = apparaisee;
	this.apparaisal = apparaisal;
	this.status_Appraisal = status_Appraisal;
	this.date = date;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id_Emp_Appriasals", unique = true, nullable = false)
    public Long getIdEmpAppriasals() {
	return this.idEmpAppriasals;
    }

    public void setIdEmpAppriasals(Long idEmpAppriasals) {
	this.idEmpAppriasals = idEmpAppriasals;
    }

    @Column(name = "Employe", nullable = false, length = 50)
    public String getEmploye() {
	return this.employe;
    }

    public void setEmploye(String employe) {
	this.employe = employe;
    }

    @Column(name = "apparaisee", nullable = false, length = 50)
    public String getApparaisee() {
	return this.apparaisee;
    }

    public void setApparaisee(String apparaisee) {
	this.apparaisee = apparaisee;
    }

    @Column(name = "Apparaisal", nullable = false)
    public int getApparaisal() {
	return this.apparaisal;
    }

    public void setApparaisal(int apparaisal) {
	this.apparaisal = apparaisal;
    }

    @Column(name = "status_Appraisal", nullable = false, length = 50)
    public String getStatus_Appraisal() {
		return status_Appraisal;
	}

	public void setStatus_Appraisal(String status_Appraisal) {
		this.status_Appraisal = status_Appraisal;
	}

    @Temporal(TemporalType.DATE)
    @Column(name = "Date", nullable = false, length = 10)
    public Date getDate() {
	return this.date;
    }

   

	public void setDate(Date date) {
	this.date = date;
    }

}
