package com.bunya.projectzero.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lecture {
	/** name of the lecture */
	private String name;
	private Department department;
	/** instructor of the lecture */
	private Instructor instructor;
	/** students who take the lecture */
	private Set<Student> students;

	public Lecture(String name, Instructor instructor, Department department) {
		this.name = name;
		this.instructor = instructor;
		this.setDepartment(department);
		this.students = new LinkedHashSet<>();
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Set<Student> getStudents() {
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

	public Department getDepartment() {
		return department;
	}

	public Long countStudents() {
		return Long.valueOf(getStudents().size());
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
