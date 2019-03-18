package com.com3g.myPm.service.metier;

import java.util.List;

import com.com3g.myPm.domaine.EmployeAppraisals;

public interface EmployeAppraisalsService {

    public List<EmployeAppraisals> findByUsername(String username);
}
