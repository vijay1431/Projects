package com.com3g.myPm.service.metier.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.com3g.myPm.domaine.Appraisals;
import com.com3g.myPm.domaine.Evaluation;
import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.domaine.PerformanceManagement;
import com.com3g.myPm.domaine.types.SectionMypm;
import com.com3g.myPm.repos.metier.AppraisalsRepos;
import com.com3g.myPm.repos.metier.EvaluationRepos;
import com.com3g.myPm.repos.metier.PerformanceBoardRepos;
import com.com3g.myPm.repos.metier.PerformanceManagementRepos;
import com.com3g.myPm.repos.metier.UsersRepos;
import com.com3g.myPm.service.exception.SectionAlreadyChosenException;
import com.com3g.myPm.service.metier.PerformanceManagementService;

@Service("performanceManagementService")
@Transactional
public class PerformanceManagementServiceImpl implements PerformanceManagementService {

	@Inject
	private PerformanceBoardRepos performanceBoardRepos;

	@Inject
	private UsersRepos usersRepos;

	@Inject
	private PerformanceManagementRepos performanceManagementRepos;

	@Inject
	private EvaluationRepos evaluationRepos;

	@Inject
	private AppraisalsRepos appraisalsRepos;

	@Override
	public List<PerformanceBoard> loadPerfomanceBoardLeft(String username) {
		// PerformanceManagement x =
		// performanceManagementRepos.findByAppraisalsAppraisalAndEmployeUsername(appraisalsRepos.findByStatus("Open").getYear(),
		// username);
		// x.getEvaluations();
		// for(Evaluation e : x.getEvaluations()){
		// e.getBoard().getId();
		// }
		return performanceBoardRepos.findAll();
	}

	@Override
	public List<PerformanceBoard> loadPerfomanceBoardBySection(SectionMypm section) {
		return performanceBoardRepos.findBySection(section);
	}

	@Override
	public void addToPerformanceManagement(SectionMypm section, String username) {
		PerformanceManagement performanceManagement = performanceManagementRepos
				.findByAppraisalsAppraisalAndEmployeUsername(appraisalsRepos.findByStatus("Open").getYear(), username);
		List<Evaluation> newEvaluations = new ArrayList<Evaluation>();
		for (PerformanceBoard board : performanceBoardRepos.findBySection(section)) {
			Evaluation eval = new Evaluation();
			eval.setBoard(board);
			eval.setPerformanceManagement(performanceManagement);
			eval = evaluationRepos.save(eval);
			newEvaluations.add(eval);
		}
		performanceManagement.getEvaluations().addAll(newEvaluations);
		performanceManagementRepos.save(performanceManagement);
	}

	@Override
	public void evaluate(Evaluation evaluation) {
		// traitement pour remplir les donnée de performance managements
		evaluationRepos.save(evaluation);
	}

	@Override
	public void saveChoice(SectionMypm section, String username) throws SectionAlreadyChosenException {
		Appraisals appraisal = appraisalsRepos.findByStatus("Open");
		PerformanceManagement performanceManagement = performanceManagementRepos
				.findByAppraisalsAppraisalAndEmployeUsername(appraisal.getAppraisal(), username);
		if (performanceManagement == null && appraisal != null) {
			performanceManagement = new PerformanceManagement();
			performanceManagement.setAppraisals(appraisal);
			performanceManagement.setEmploye(usersRepos.findByUsername(username));
			performanceManagement.setStatus("Open");
		}
		for (com.com3g.myPm.domaine.SectionMypm sectionEntity : performanceManagement.getSections()) {
			if (sectionEntity.getSection() == section)
				throw new SectionAlreadyChosenException();
		}
		com.com3g.myPm.domaine.SectionMypm newsec = new com.com3g.myPm.domaine.SectionMypm();
		newsec.setSection(section);
		performanceManagement.getSections().add(newsec);
		performanceManagementRepos.save(performanceManagement);

	}

	@Override
	public PerformanceManagement loadPerformanceMgmtByUsername(String username) {
		Appraisals appraisal = appraisalsRepos.findByStatus("Open");
		PerformanceManagement performanceManagement = performanceManagementRepos
				.findByAppraisalsAppraisalAndEmployeUsername(appraisal.getAppraisal(), username);
		if (performanceManagement == null && appraisal != null) {
			performanceManagement = new PerformanceManagement();
			performanceManagement.setAppraisals(appraisal);
			performanceManagement.setEmploye(usersRepos.findByUsername(username));
			performanceManagement.setStatus("Open");
		}
		performanceManagement = performanceManagementRepos.save(performanceManagement);
		return performanceManagement;
	}
	
	@Override
	public PerformanceManagement loadPerformanceMgmtClosedByUsername(String username) {
		Appraisals appraisal = appraisalsRepos.findByStatus("Open"); //TODO modifier
		PerformanceManagement performanceManagement = performanceManagementRepos
				.findByAppraisalsAppraisalAndEmployeUsername(appraisal.getAppraisal(), username);
		performanceManagement = performanceManagementRepos.save(performanceManagement);
		return performanceManagement;
	}

	@Override
	public List<Evaluation> loadEvaluations(String username) {
		Appraisals appraisal = appraisalsRepos.findByStatus("Open");
		PerformanceManagement performance = performanceManagementRepos.findByAppraisalsAppraisalAndEmployeUsername(
				appraisal.getAppraisal(), username);
		List<Evaluation> listeval = evaluationRepos.findByPerformanceManagement_id(performance.getId());
		if (listeval == null || listeval.isEmpty()) {
			for (com.com3g.myPm.domaine.SectionMypm section : performance.getSections()) {
				for (PerformanceBoard board : performanceBoardRepos.findBySection(section.getSection())) {
					Evaluation eval = new Evaluation();
					eval.setBoard(board);
					eval.setPerformanceManagement(performance);
					evaluationRepos.save(eval);
					listeval.add(eval);
				}
			}
		}
		return listeval;
	}

	@Override
	public List<Evaluation> loadEvaluations(String selectedUsername, SectionMypm section) {
		Appraisals appraisal = appraisalsRepos.findByStatus("Open");
		PerformanceManagement performance = performanceManagementRepos.findByAppraisalsAppraisalAndEmployeUsername(
				appraisal.getAppraisal(), selectedUsername);
		List<Evaluation> listeval = evaluationRepos.findByPerformanceManagement_idAndBoardSection(performance.getId(),
				section);
		if (listeval == null || listeval.isEmpty()) {
			for (PerformanceBoard board : performanceBoardRepos.findBySection(section)) {
				Evaluation eval = new Evaluation();
				eval.setBoard(board);
				eval.setPerformanceManagement(performance);
				evaluationRepos.save(eval);
				listeval.add(eval);
			}
		}
		return listeval;
	}

	@Override
	public void saveEvaluations(List<Evaluation> evaluations) {
		int summary = 0;
		SectionMypm section;
		Long idPerformance;
		if (evaluations.isEmpty())
			return;
		else {
			section = evaluations.get(0).getBoard().getSection();
			idPerformance = evaluations.get(0).getPerformanceManagement().getId();
		}

		for (Evaluation eval : evaluations) {
			summary += eval.getNote() * eval.getWeight() / 100;
		}
		evaluationRepos.save(evaluations);
		PerformanceManagement performance = performanceManagementRepos.findOne(idPerformance);
		switch (section) {
		case JOB_EXECUTION:
			performance.setJobExecutionRating(summary);
			break;
		case CODE_CONDUCT:
			performance.setCodeConductRating(summary);
			break;
		case LEADER_DEPEND:
			performance.setLeaderDependRating(summary);
			break;
		case MANAGMENT_RESP:
			performance.setManagementRespRating(summary);
			break;
		case PERSONAL_ATTRIBUT:
			performance.setPersonalAttriRating(summary);
			break;
		}
		performanceManagementRepos.save(performance);

	}

}
