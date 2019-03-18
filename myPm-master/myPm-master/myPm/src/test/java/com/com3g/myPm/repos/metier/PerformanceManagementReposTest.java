package com.com3g.myPm.repos.metier;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:META-INF/spring/applicationContext-data.xml",
	"classpath:META-INF/spring/applicationContext-mail.xml",
	"classpath:META-INF/spring/applicationContext-security.xml",
	"classpath:META-INF/spring/applicationContext-aop.xml",
	"classpath:META-INF/spring/applicationContext.xml" })
public class PerformanceManagementReposTest {

	@Inject
	private PerformanceManagementRepos managementRepos;
	
	@Test
	public void test() {
		managementRepos.findAll();
	}

}
