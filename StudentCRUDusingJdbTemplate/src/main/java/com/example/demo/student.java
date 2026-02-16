package com.example.demo;

import org.springframework.stereotype.Component;

public class student {

	private String id;
	private String name;
	private float marks;

	public student(String id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Float getMarks() {
		return this.marks;
	}

}
