package com.com3g.myPm.service.metier.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.repos.metier.PerformanceBoardRepos;
import com.com3g.myPm.service.metier.PerformanceBoardService;

@Service("performanceBoardService")
public class PerformanceBoardServiceImpl implements PerformanceBoardService {

	@Inject
	private PerformanceBoardRepos performanceBoardRepos;
	
	@Override
	public List<PerformanceBoard> findAll() {
		return performanceBoardRepos.findAll();
	}

}
