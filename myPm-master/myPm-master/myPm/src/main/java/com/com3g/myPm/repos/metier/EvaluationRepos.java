package com.com3g.myPm.repos.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.Evaluation;
import com.com3g.myPm.domaine.types.SectionMypm;

public interface EvaluationRepos extends JpaRepository<Evaluation, Long> {

	public List<Evaluation> findByPerformanceManagement_id(Long id);

	public List<Evaluation> findByPerformanceManagement_idAndBoardSection(Long id, SectionMypm section);
}
