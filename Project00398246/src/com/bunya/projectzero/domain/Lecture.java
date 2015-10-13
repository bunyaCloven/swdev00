package com.bunya.projectzero.domain;

import java.util.LinkedList;
import java.util.List;

public class Lecture {
	/** name of the lecture */
	private String name;
	/** instructor of the lecture */
	private Instructor instructor;
	/** students who take the lecture */
	private List<Student> students ;

	public Lecture(String name, Instructor instructor) {
		this.name = name;
		this.instructor = instructor;
		this.students = new LinkedList<>();
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
