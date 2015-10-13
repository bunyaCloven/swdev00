package com.bunya.projectzero.domain;

public class VisitorInstructor extends Instructor {

	public VisitorInstructor(String name, Department department) {
		super(name, department);
	}

	@Override
	public LecturerType getType() {
		return LecturerType.VISITOR;
	}

}
