package com.com3g.myPm.domaine;
// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ESpouse generated by hbm2java
 */
@Entity
@Table(name="e_spouse"
    ,catalog="mypm"
)
public class ESpouse  implements java.io.Serializable {


     private String spouseId;
     private String resurceId;
     private String spouseName;
     private Date spouseBirthday;
     private String spouseStatus;
     private String approved;

    public ESpouse() {
    }

	
    public ESpouse(String spouseId, String resurceId) {
        this.spouseId = spouseId;
        this.resurceId = resurceId;
    }
    public ESpouse(String spouseId, String resurceId, String spouseName, Date spouseBirthday, String spouseStatus, String approved) {
       this.spouseId = spouseId;
       this.resurceId = resurceId;
       this.spouseName = spouseName;
       this.spouseBirthday = spouseBirthday;
       this.spouseStatus = spouseStatus;
       this.approved = approved;
    }
   
     @Id 
    
    @Column(name="SPOUSE_ID", unique=true, nullable=false, length=100)
    public String getSpouseId() {
        return this.spouseId;
    }
    
    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }
    
    @Column(name="RESURCE_ID", nullable=false, length=500)
    public String getResurceId() {
        return this.resurceId;
    }
    
    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }
    
    @Column(name="SPOUSE_NAME", length=450)
    public String getSpouseName() {
        return this.spouseName;
    }
    
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="SPOUSE_BIRTHDAY", length=10)
    public Date getSpouseBirthday() {
        return this.spouseBirthday;
    }
    
    public void setSpouseBirthday(Date spouseBirthday) {
        this.spouseBirthday = spouseBirthday;
    }
    
    @Column(name="SPOUSE_STATUS", length=50)
    public String getSpouseStatus() {
        return this.spouseStatus;
    }
    
    public void setSpouseStatus(String spouseStatus) {
        this.spouseStatus = spouseStatus;
    }
    
    @Column(name="approved", length=100)
    public String getApproved() {
        return this.approved;
    }
    
    public void setApproved(String approved) {
        this.approved = approved;
    }




}


