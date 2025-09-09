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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="subjectsmany")
public class Subjects {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String subname;

	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL},mappedBy = "subjects")
		  
		  private Set<Students> students= new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public Set<Students> getStudents() {
		return students;
	}

	public void setStudents(Set<Students> students) {
		this.students = students;
	}

	public Subjects(int id, String subname, Set<Students> students) {
		super();
		this.id = id;
		this.subname = subname;
		this.students = students;
	}

	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
