package com.com3g.myPm.repos.metier;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.domaine.types.SectionMypm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/applicationContext-data.xml",
		"classpath:META-INF/spring/applicationContext-mail.xml",
		"classpath:META-INF/spring/applicationContext-security.xml",
		"classpath:META-INF/spring/applicationContext-aop.xml", "classpath:META-INF/spring/applicationContext.xml" })
public class PerformanceBoardReposTest {

	@Inject
	private PerformanceBoardRepos performanceBoardRepos;

	@Test
	public void test() {
		PerformanceBoard board = new PerformanceBoard();

		// Job Execution
		board.setId(1L);
		board.setTitle("JOB KNOWLEDGE / UNDERSTANDING OF SYSTEMS");
		board.setDetails("Degree of knowledge and understanding of position responsibilities; departmental and institutional work procedures, processes and related policies");
		board.setIdCritere(1);
		board.setSection(SectionMypm.JOB_EXECUTION);

		performanceBoardRepos.save(board);

		board.setId(2L);
		board.setTitle("QUALITY OF WORK");
		board.setDetails("Extent to which employee can be counted upon to carry out assignments to completion");
		board.setIdCritere(2);
		board.setSection(SectionMypm.JOB_EXECUTION);

		performanceBoardRepos.save(board);

		board.setId(3L);
		board.setTitle("QUANTITY OF WORK");
		board.setDetails("Volume of work regularly produced, Speed and consistency of output.");
		board.setIdCritere(3);
		board.setSection(SectionMypm.JOB_EXECUTION);

		performanceBoardRepos.save(board);

		board.setId(4L);
		board.setTitle("ANALYTICAL ABILITY");
		board.setDetails("Extend to which employee can analytically review the situation/task and improvise a strategy based on the same");
		board.setIdCritere(4);
		board.setSection(SectionMypm.JOB_EXECUTION);

		performanceBoardRepos.save(board);

		board.setId(5L);
		board.setTitle("THEORETICAL KNOWLEDGE");
		board.setDetails("Extent of job information and understanding");
		board.setIdCritere(5);
		board.setSection(SectionMypm.JOB_EXECUTION);

		performanceBoardRepos.save(board);

		// Code Conduct
		// TODO a completer
		board.setId(6L);
		board.setTitle("ATTENDANCE");
		board.setDetails("Regularity of employee");
		board.setIdCritere(1);
		board.setSection(SectionMypm.CODE_CONDUCT);

		performanceBoardRepos.save(board);

		board.setId(7L);
		board.setTitle("PUNCTUALITY");
		board.setDetails("Extent to which employee respects the office");
		board.setIdCritere(2);
		board.setSection(SectionMypm.CODE_CONDUCT);

		performanceBoardRepos.save(board);

		board.setId(8L);
		board.setTitle("ETHICS");
		board.setDetails("Extent to which the employee maintains high");
		board.setIdCritere(3);
		board.setSection(SectionMypm.CODE_CONDUCT);

		performanceBoardRepos.save(board);

		board.setId(9L);
		board.setTitle("COMPANY RESOURCES");
		board.setDetails("Extent to which the employee is careful about the appropriate usage of the company resources");
		board.setIdCritere(4);
		board.setSection(SectionMypm.CODE_CONDUCT);

		performanceBoardRepos.save(board);

		board.setId(10L);
		board.setTitle("INTEGRITY");
		board.setDetails("The extent to which an employee fulfills all his/her job requirements with full honesty");
		board.setIdCritere(5);
		board.setSection(SectionMypm.CODE_CONDUCT);

		performanceBoardRepos.save(board);

		// LEADERSHIP AND DEPENDABILTY

		board.setId(11L);
		board.setTitle("ABILITY TO MEET THE DEADLINES");
		board.setDetails("The Employee’s ability to meet deadlines and accept responsibilities of the job individually and in group assignments");
		board.setIdCritere(1);
		board.setSection(SectionMypm.LEADER_DEPEND);

		performanceBoardRepos.save(board);

		board.setId(12L);
		board.setTitle("LEADERSHIP");
		board.setDetails("Consider his/her ability to influence and motivate other team members to accomplish a task, objective or project");
		board.setIdCritere(2);
		board.setSection(SectionMypm.LEADER_DEPEND);

		performanceBoardRepos.save(board);

		board.setId(13L);
		board.setTitle("PLANNING/DECISION MAKING");
		board.setDetails("Success in setting priorities; analyzing, organizing, and forecasting unit functions; and rendering competent decisions to achieve unit goals");
		board.setIdCritere(3);
		board.setSection(SectionMypm.LEADER_DEPEND);

		performanceBoardRepos.save(board);

		board.setId(14L);
		board.setTitle("ADAPTABILITY");
		board.setDetails("Extent to which employee is able to perform a variety of assignments within the scope of his/her job duties");
		board.setIdCritere(4);
		board.setSection(SectionMypm.LEADER_DEPEND);

		performanceBoardRepos.save(board);

		board.setId(15L);
		board.setTitle("INITIATIVE / INNOVATION");
		board.setDetails("Willingness to assume additional responsibilities; to develop and/or pursue alternate/new concepts to facilitate the achievement of unit goals");
		board.setIdCritere(5);
		board.setSection(SectionMypm.LEADER_DEPEND);

		performanceBoardRepos.save(board);
		// PERSONALITY ATTRIBUTES
		board.setId(16L);
		board.setTitle("COMMUNICATION");
		board.setDetails("Effectiveness of communication");
		board.setIdCritere(1);
		board.setSection(SectionMypm.PERSONAL_ATTRIBUT);

		performanceBoardRepos.save(board);

		board.setId(17L);
		board.setTitle("ABILITY TO WORK WITH OTHERS / TEAMWORK");
		board.setDetails("ABILITY TO WORK WITH OTHERS / TEAMWORK: Extent to which employee effectively interacts with others in the performance of his/her job");
		board.setIdCritere(2);
		board.setSection(SectionMypm.PERSONAL_ATTRIBUT);

		performanceBoardRepos.save(board);

		board.setId(18L);
		board.setTitle("MATURITY");
		board.setDetails("Level of maturity in handling peers, customers, colleagues and situations");
		board.setIdCritere(3);
		board.setSection(SectionMypm.PERSONAL_ATTRIBUT);

		performanceBoardRepos.save(board);

		board.setId(19L);
		board.setTitle("STAFF DEVELOPMENT/LEADERSHIP");
		board.setDetails("Success in training, developing, motivating, and maximizing the knowledge and skills of subordinates in the accomplishment of unit and/or individual staff objectives");
		board.setIdCritere(4);
		board.setSection(SectionMypm.PERSONAL_ATTRIBUT);

		performanceBoardRepos.save(board);

		board.setId(20L);
		board.setTitle("ATTITUDE");
		board.setDetails("Amount of interest and enthusiasm shown in work (20%) and the amount of job cooperation extended towards others");
		board.setIdCritere(5);
		board.setSection(SectionMypm.PERSONAL_ATTRIBUT);

		performanceBoardRepos.save(board);

		// MANAGEMENT RESPONSIBILITIES

		board.setId(21L);
		board.setTitle("MISSION & COMMITTMENT");
		board.setDetails("Demonstrates commitment to organization’s vision and values. Is respectful of all levels of organization and all departments");
		board.setIdCritere(1);
		board.setSection(SectionMypm.MANAGMENT_RESP);

		performanceBoardRepos.save(board);

		board.setId(22L);
		board.setTitle("REPRESENTING 3GCOM");
		board.setDetails("Represents EMS in a positive and professional manner both to internal teams and external parties");
		board.setIdCritere(2);
		board.setSection(SectionMypm.MANAGMENT_RESP);

		performanceBoardRepos.save(board);

		board.setId(23L);
		board.setTitle("STRATEGIC VALUE");
		board.setDetails("Exercises judgment in building realistic solutions to problems. Uses systematic decision making process to get at real issues. Contributes useful ideas for business diversity as well as cost savings for organization");
		board.setIdCritere(3);
		board.setSection(SectionMypm.MANAGMENT_RESP);

		performanceBoardRepos.save(board);

		board.setId(24L);
		board.setTitle("EXCELLENCE");
		board.setDetails("Delivers high quality results on time, contributes to department l/organizational quality and/or process improvement efforts, actively promotes innovation, speed and change in proving processes, programs or services");
		board.setIdCritere(4);
		board.setSection(SectionMypm.MANAGMENT_RESP);

		performanceBoardRepos.save(board);

		board.setId(25L);
		board.setTitle("DEVELOPING OTHERS");
		board.setDetails("Develops and communicates clear realistic performance expectations, Coaches to help others resolve problems. Provides fair, consistent, timely and specific feedback. Provides support to individuals and teams outside his/her own area");
		board.setIdCritere(5);
		board.setSection(SectionMypm.MANAGMENT_RESP);

		performanceBoardRepos.save(board);
	}

}