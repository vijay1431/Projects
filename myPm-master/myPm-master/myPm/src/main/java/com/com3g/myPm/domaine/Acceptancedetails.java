package com.com3g.myPm.domaine;
// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Acceptancedetails generated by hbm2java
 */
@Entity
@Table(name="acceptancedetails"
    ,catalog="mypm"
)
public class Acceptancedetails  implements java.io.Serializable {


     private Integer idacceptanceDetails;
     private Acceptance acceptance;
     private Podetails podetails;
     private String acceptanceType;
     private Double quantityAccepted;
     private Double percentage;
     private Double totalPriceAccepted;
     private String status;

    public Acceptancedetails() {
    }

	
    public Acceptancedetails(Acceptance acceptance, Podetails podetails) {
        this.acceptance = acceptance;
        this.podetails = podetails;
    }
    public Acceptancedetails(Acceptance acceptance, Podetails podetails, String acceptanceType, Double quantityAccepted, Double percentage, Double totalPriceAccepted, String status) {
       this.acceptance = acceptance;
       this.podetails = podetails;
       this.acceptanceType = acceptanceType;
       this.quantityAccepted = quantityAccepted;
       this.percentage = percentage;
       this.totalPriceAccepted = totalPriceAccepted;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idacceptanceDetails", unique=true, nullable=false)
    public Integer getIdacceptanceDetails() {
        return this.idacceptanceDetails;
    }
    
    public void setIdacceptanceDetails(Integer idacceptanceDetails) {
        this.idacceptanceDetails = idacceptanceDetails;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="acceptance_idacceptance", nullable=false)
    public Acceptance getAcceptance() {
        return this.acceptance;
    }
    
    public void setAcceptance(Acceptance acceptance) {
        this.acceptance = acceptance;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="podetails_idpoDetails", nullable=false)
    public Podetails getPodetails() {
        return this.podetails;
    }
    
    public void setPodetails(Podetails podetails) {
        this.podetails = podetails;
    }
    
    @Column(name="acceptanceType", length=45)
    public String getAcceptanceType() {
        return this.acceptanceType;
    }
    
    public void setAcceptanceType(String acceptanceType) {
        this.acceptanceType = acceptanceType;
    }
    
    @Column(name="quantityAccepted", precision=22, scale=0)
    public Double getQuantityAccepted() {
        return this.quantityAccepted;
    }
    
    public void setQuantityAccepted(Double quantityAccepted) {
        this.quantityAccepted = quantityAccepted;
    }
    
    @Column(name="percentage", precision=22, scale=0)
    public Double getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    
    @Column(name="totalPriceAccepted", precision=22, scale=0)
    public Double getTotalPriceAccepted() {
        return this.totalPriceAccepted;
    }
    
    public void setTotalPriceAccepted(Double totalPriceAccepted) {
        this.totalPriceAccepted = totalPriceAccepted;
    }
    
    @Column(name="status", length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


