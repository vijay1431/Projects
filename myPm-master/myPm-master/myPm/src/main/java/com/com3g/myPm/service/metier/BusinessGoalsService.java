package com.com3g.myPm.service.metier;

import java.util.List;

import com.com3g.myPm.domaine.BusinessGoals;
import com.com3g.myPm.view.metier.BuisnessGoalsEdit;

public interface BusinessGoalsService {
	public void delete(BusinessGoals businessGoals);
    public void saveBusinessGoals(BusinessGoals businessGoals);
    public List<BusinessGoals> findByManager(String username);
    public List<BusinessGoals> findByEmployeOpen(String username);
    public List<BusinessGoals> findByEmployeClosed(String username);
    

}
