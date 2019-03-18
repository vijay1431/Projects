package com.com3g.myPm.service.metier.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.repos.metier.AppraisalsRepos;
import com.com3g.myPm.repos.metier.EGeneralDataRepos;
import com.com3g.myPm.service.metier.EGeneralDataService;
@Service("eGeneralDataService")
public class EGeneralDataServiceImpl implements EGeneralDataService {
    @Autowired
    EGeneralDataRepos eGeneralDataRepos;
    @Override
    public EGeneralData findOrganisatationel(String username) {
	
	return eGeneralDataRepos.findOne(username);
    }

}
