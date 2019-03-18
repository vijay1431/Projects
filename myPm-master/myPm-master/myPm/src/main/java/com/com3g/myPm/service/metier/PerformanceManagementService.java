package com.com3g.myPm.service.metier;

import java.util.List;

import com.com3g.myPm.domaine.Evaluation;
import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.domaine.PerformanceManagement;
import com.com3g.myPm.domaine.types.SectionMypm;
import com.com3g.myPm.service.exception.SectionAlreadyChosenException;

public interface PerformanceManagementService {

	public List<PerformanceBoard> loadPerfomanceBoardLeft(String username);
	
	public void addToPerformanceManagement(SectionMypm section, String username);
	
	public void evaluate(Evaluation evaluation);

	public List<PerformanceBoard> loadPerfomanceBoardBySection(SectionMypm section);

	public void saveChoice(SectionMypm section, String username) throws SectionAlreadyChosenException;
	
	public PerformanceManagement loadPerformanceMgmtByUsername(String username);

	public List<Evaluation> loadEvaluations(String username);

	public List<Evaluation> loadEvaluations(String selectedUsername, SectionMypm section);

	public void saveEvaluations(List<Evaluation> evaluations);

	public PerformanceManagement loadPerformanceMgmtClosedByUsername(String username);
	
}
