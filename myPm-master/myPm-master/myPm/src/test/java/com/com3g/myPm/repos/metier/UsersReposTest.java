package com.com3g.myPm.repos.metier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.com3g.myPm.domaine.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:META-INF/spring/applicationContext-data.xml",
	"classpath:META-INF/spring/applicationContext-mail.xml",
	"classpath:META-INF/spring/applicationContext-security.xml",
	"classpath:META-INF/spring/applicationContext-aop.xml",
	"classpath:META-INF/spring/applicationContext.xml" })
//@TransactionConfiguration(defaultRollback = true)
//@Transactional
public class UsersReposTest {

	@Autowired
	private UsersRepos userRepos;
	
    @Test
    public void test() {
    /*Users user = new Users("kecha");	
    userRepos.save(user);*/
	System.out.println(userRepos.findByUsername("m.bougri"));
    }

}
