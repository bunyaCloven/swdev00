package com.bunya.projectzero.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Instructor {
	/** name of the instructor */
	private String name;
	/** department of the instructor */
	private Department department;
	private Set<Lecture> lectures;

	public Instructor(String name, Department department) {
		this.name = name;
		this.department = department;
		this.lectures = new LinkedHashSet<>();
	}

	/** Instructor type to be used in views that show all instructors */
	public abstract LecturerType getType();

	/** @return {@link #name} */
	public String getName() {
		return name;
	}

	/** @return {@link #department} */
	public Department getDepartment() {
		return department;
	}

	/** sets {@link #department} */
	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Lecture> getLectures() {
		return lectures;
	}

	public void addLecture(Lecture lecture) {
		lectures.add(lecture);
	}

	public Long countStudents() {
		Long result = 0L;
		for (Lecture lecture : lectures) {
			result += lecture.countStudents();
		}
		return result;
	}
}
