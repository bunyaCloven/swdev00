package com.bunya.projectzero.domain;

public class RegularInstructor extends Instructor {

	public RegularInstructor(String name, Department department) {
		super(name, department);
	}

	@Override
	public LecturerType getType() {
		return LecturerType.REGULAR;
	}

}
