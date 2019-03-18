package com.com3g.myPm.domaine;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "e_contract_data", catalog = "mypm")
public class EContractData implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer contratId;
    private String username;
    private String contractType;
    private Date hireDate;
    private Date contractStartDate;
    private Date contractEndDate;
    private String contractStatus;
    private String description;

    public EContractData() {
    }

    public EContractData(String username) {
	this.username = username;
    }

    public EContractData(String username, String contractType, Date hireDate, Date contractStartDate,
	    Date contractEndDate, String contractStatus, String description) {
	this.username = username;
	this.contractType = contractType;
	this.hireDate = hireDate;
	this.contractStartDate = contractStartDate;
	this.contractEndDate = contractEndDate;
	this.contractStatus = contractStatus;
	this.description = description;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CONTRAT_Id", unique = true, nullable = false)
    public Integer getContratId() {
	return this.contratId;
    }

    public void setContratId(Integer contratId) {
	this.contratId = contratId;
    }

    @Column(name = "RESURCE_ID", nullable = false, length = 500)
    public String getUsername() {
	return this.username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    @Column(name = "CONTRACT_TYPE", length = 100)
    public String getContractType() {
	return this.contractType;
    }

    public void setContractType(String contractType) {
	this.contractType = contractType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "HIRE_DATE", length = 10)
    public Date getHireDate() {
	return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_START_DATE", length = 10)
    public Date getContractStartDate() {
	return this.contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
	this.contractStartDate = contractStartDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_END_DATE", length = 10)
    public Date getContractEndDate() {
	return this.contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
	this.contractEndDate = contractEndDate;
    }

    @Column(name = "CONTRACT_STATUS", length = 100)
    public String getContractStatus() {
	return this.contractStatus;
    }

    public void setContractStatus(String contractStatus) {
	this.contractStatus = contractStatus;
    }

    @Column(name = "DESCRIPTION", length = 450)
    public String getDescription() {
	return this.description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}
