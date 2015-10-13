package com.bunya.projectzero.domain;

import java.util.LinkedList;
import java.util.List;

public class Student {
	/** name of the student */
	private String name;
	/** lectures that students take */
	private List<Lecture> takenLectures = new LinkedList<>();

	public Student(String name) {
		this.name = name;
	}

	/** @return {@link #name} */
	public String getName() {
		return name;
	}
	/** @return {@link #takenLectures}*/
	public List<Lecture> getTakenLectures() {
		return takenLectures;
	}

	public void takeLecture(Lecture lecture) {
		takenLectures.add(lecture);
	}

}
