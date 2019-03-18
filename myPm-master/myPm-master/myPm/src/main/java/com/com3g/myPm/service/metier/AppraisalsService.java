package com.com3g.myPm.service.metier;

import java.util.List;

import com.com3g.myPm.domaine.Appraisals;

public interface AppraisalsService {
    public void saveApprialsal(Appraisals appraisals);
    public List<Appraisals> findAllAppraisals();
    public void deleteAppraisal(Appraisals appraisals);
    public int getYearOpen();

}
