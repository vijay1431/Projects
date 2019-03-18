package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.EGeneralData;

public interface EGeneralDataRepos  extends JpaRepository<EGeneralData, String>{
    
}
