package com.bunya.projectzero.domain;

import java.util.LinkedList;
import java.util.List;

public class Department {
	private String name;
	private List<Instructor> instructors;

	public Department(String name) {
		super();
		this.name = name;
		this.instructors = new LinkedList<>();
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}

	/** @return {@link name} */
	public String getName() {
		return name;
	}

	/** sets {@link name} */
	public void setName(String name) {
		this.name = name;
	}
}
