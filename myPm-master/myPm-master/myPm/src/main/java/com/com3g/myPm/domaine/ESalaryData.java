package com.com3g.myPm.domaine;
// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ESalaryData generated by hbm2java
 */
@Entity
@Table(name="e_salary_data"
    ,catalog="mypm"
)
public class ESalaryData  implements java.io.Serializable {


     private Integer salaryId;
     private String resurceId;
     private Double baseSalary;
     private String description;
     private int mois;
     private int ans;

    public ESalaryData() {
    }

	
    public ESalaryData(String resurceId, int mois, int ans) {
        this.resurceId = resurceId;
        this.mois = mois;
        this.ans = ans;
    }
    public ESalaryData(String resurceId, Double baseSalary, String description, int mois, int ans) {
       this.resurceId = resurceId;
       this.baseSalary = baseSalary;
       this.description = description;
       this.mois = mois;
       this.ans = ans;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="SALARY_ID", unique=true, nullable=false)
    public Integer getSalaryId() {
        return this.salaryId;
    }
    
    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }
    
    @Column(name="RESURCE_ID", nullable=false, length=500)
    public String getResurceId() {
        return this.resurceId;
    }
    
    public void setResurceId(String resurceId) {
        this.resurceId = resurceId;
    }
    
    @Column(name="BASE_SALARY", precision=22, scale=0)
    public Double getBaseSalary() {
        return this.baseSalary;
    }
    
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Column(name="DESCRIPTION", length=450)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="mois", nullable=false)
    public int getMois() {
        return this.mois;
    }
    
    public void setMois(int mois) {
        this.mois = mois;
    }
    
    @Column(name="ans", nullable=false)
    public int getAns() {
        return this.ans;
    }
    
    public void setAns(int ans) {
        this.ans = ans;
    }




}


