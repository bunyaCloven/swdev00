package com.bunya.projectzero.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
	/** name of the student */
	private String name;
	private Department department;
	/** lectures that students take */
	private Set<Lecture> takenLectures;

	public Student(String name, Department department) {
		this.name = name;
		this.setDepartment(department);
		this.takenLectures = new LinkedHashSet<>();
	}

	/** @return {@link #name} */
	public String getName() {
		return name;
	}

	/** @return {@link #takenLectures} */
	public Set<Lecture> getTakenLectures() {
		return takenLectures;
	}

	public void takeLecture(Lecture lecture) {
		takenLectures.add(lecture);
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
