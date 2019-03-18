package com.com3g.myPm.service.metier.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.EmployeAppraisals;
import com.com3g.myPm.repos.metier.EmployeAppraisalsRepos;
import com.com3g.myPm.service.metier.EmployeAppraisalsService;

@Service("employeAppraisalsService")
public class EmployeAppraisalsServiceImpl implements EmployeAppraisalsService {

    @Autowired
    private EmployeAppraisalsRepos employeAppraisalsRepos;

    @Override
    public List<EmployeAppraisals> findByUsername(String username) {
	return employeAppraisalsRepos.findByEmploye(username);
    }

}
