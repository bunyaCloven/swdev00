package com.bunya.projectzero.domain;

public abstract class Instructor {
	/** name of the instructor */
	private String name;
	/** department of the instructor */
	private Department department;

	public Instructor(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	/** Instructor type to be used in views that show all instructors */
	public abstract String getInstructorType();

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
}
