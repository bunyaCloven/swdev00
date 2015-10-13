package com.bunya.projectzero.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Department {
	private String name;
	private Set<Instructor> instructors;
	private Set<Lecture> lectures;

	public Department(String name) {
		super();
		this.name = name;
		this.instructors = new LinkedHashSet<>();
		this.lectures = new LinkedHashSet<>();
	}

	/** @return {@link name} */
	public String getName() {
		return name;
	}

	/** sets {@link name} */
	public void setName(String name) {
		this.name = name;
	}

	public Set<Instructor> getInstructors() {
		return instructors;
	}

	public Set<Lecture> getLectures() {
		return lectures;
	}

	public Long countStudents() {
		Long result = 0L;
		for (Lecture lecture : lectures) {
			result += lecture.countStudents();
		}
		return result;
	}

	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}

	public void addLecture(Lecture lecture) {
		lectures.add(lecture);
	}

}
