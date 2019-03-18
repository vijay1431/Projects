package com.com3g.myPm.service.metier;


import java.util.List;

import com.com3g.myPm.domaine.*;

public interface AffectationService {
    public List<EGeneralData> getbyManager(String username);
    public Affectation findByUsersUsername(String username); 
    

}
