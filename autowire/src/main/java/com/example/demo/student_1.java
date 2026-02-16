package com.example.demo;

import org.springframework.stereotype.Component;

@Component("student_1")
public class student_1 implements students{

	@Override
	public void show() {
		System.out.println("Hello student_1");
		
	}

}
