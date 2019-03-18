package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com3g.myPm.domaine.Users;

@Repository("usersRepos")
public interface UsersRepos  extends JpaRepository<Users, Long>{
    
    public Users findByUsername(String username);
}
