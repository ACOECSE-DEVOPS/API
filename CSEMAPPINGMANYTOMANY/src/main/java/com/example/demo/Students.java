package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="manystudents")
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String branch;
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
		  @JoinTable(name = "students_subjects",joinColumns = { @JoinColumn(name = "CseStudents_id") },
		        inverseJoinColumns = { @JoinColumn(name = "Subjects_id") })
		  private Set<Subjects> subjects = new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Set<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}
	public Students(int id, String name, String branch, Set<Subjects> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.subjects = subjects;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
