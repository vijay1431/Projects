package com.com3g.myPm.service.metier.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.Affectation;
import com.com3g.myPm.domaine.EGeneralData;
import com.com3g.myPm.repos.metier.AffectationRepos;
import com.com3g.myPm.repos.metier.EGeneralDataRepos;
import com.com3g.myPm.service.metier.AffectationService;

@Service("affectationService")
public class AffectationServiceImpl implements AffectationService {
	@Autowired
	AffectationRepos affectationRepos;
	@Autowired
	EGeneralDataRepos eGeneralDataRepos;

	@Override
	public List<EGeneralData> getbyManager(String username) {
		List<Affectation> affectationlist = new ArrayList<Affectation>();
		List<EGeneralData> affectToReturn = new ArrayList<EGeneralData>();
		affectationlist = affectationRepos.findAll();

		for (Affectation affect : affectationlist) {

			if (affect.getUsersByUsersLm().getUsername().equals(username)) {
				affectToReturn.add(eGeneralDataRepos.findOne(affect
						.getUsersByUsersUsername().getUsername()));
			}

		}

		return affectToReturn;

	}

	@Override
	public Affectation findByUsersUsername(String username) {
		Affectation affectation = new Affectation();

		List<Affectation> list = new ArrayList<Affectation>();
		list = affectationRepos.findAll();

		for (Affectation affect : list) {

			if (affect.getUsersByUsersUsername().getUsername().equals(username)) {
				affectation = affect;
			}

		}

		return affectation;
	}

}
