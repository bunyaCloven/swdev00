package com.bunya.projectzero.application;

import java.util.LinkedHashSet;
import java.util.Set;

import com.bunya.projectzero.domain.Department;
import com.bunya.projectzero.domain.Instructor;
import com.bunya.projectzero.domain.Lecture;
import com.bunya.projectzero.domain.RegularInstructor;

public class LectureSimulator {
	public static void main(String[] args) {
		Department ceng = new Department("Computer Engineering");
		Instructor tugkan = new RegularInstructor("Tuğkan Tuğlular", ceng);
		// how many students takes lectures from a department?
		ceng.countStudents();
		// how many students does an instructor have?
		tugkan.countStudents();
		// what are the lectures given by a department?
		Set<Lecture> lectures = new LinkedHashSet<>();
		for(Instructor instructor: ceng.getInstructors()){
			lectures.addAll(instructor.getLectures());
		}
		// does this student take lecture from that department?
		// how many students in total takes lectures from a department?
		// how many students in total does an instructor have?
		// how many hourly instructors does a department have?
	}
}
