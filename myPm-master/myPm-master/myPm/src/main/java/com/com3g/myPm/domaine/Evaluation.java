package com.com3g.myPm.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(fetch = FetchType.EAGER)
	private PerformanceBoard board;
	private int note;
	private int weight;
	@ManyToOne
	private PerformanceManagement performanceManagement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PerformanceBoard getBoard() {
		return board;
	}

	public void setBoard(PerformanceBoard board) {
		this.board = board;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public PerformanceManagement getPerformanceManagement() {
		return performanceManagement;
	}

	public void setPerformanceManagement(PerformanceManagement performanceManagement) {
		this.performanceManagement = performanceManagement;
	}

}
