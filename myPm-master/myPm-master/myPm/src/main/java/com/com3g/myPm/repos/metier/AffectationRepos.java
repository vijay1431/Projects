package com.com3g.myPm.repos.metier;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.Affectation;

public interface AffectationRepos   extends JpaRepository<Affectation, String> {
    public List<Affectation> findByUsersByUsersUsername(String username);
    public List<Affectation> findByUsersByUsersLm(String username);

}
