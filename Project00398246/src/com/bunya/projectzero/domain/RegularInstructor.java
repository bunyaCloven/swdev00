package com.bunya.projectzero.domain;

public class RegularInstructor extends Instructor {

	public RegularInstructor(String name, Department department) {
		super(name, department);
	}

	@Override
	public String getInstructorType() {
		return "regular";
	}

}
