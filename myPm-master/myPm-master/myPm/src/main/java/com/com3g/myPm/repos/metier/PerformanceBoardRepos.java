package com.com3g.myPm.repos.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.domaine.types.SectionMypm;

@Repository
public interface PerformanceBoardRepos extends JpaRepository<PerformanceBoard, Long>{

	public List<PerformanceBoard> findBySection(SectionMypm section);
}
