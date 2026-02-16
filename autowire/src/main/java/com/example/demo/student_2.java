package com.example.demo;

import org.springframework.stereotype.Component;

@Component("student_2")
public class student_2 implements students{

	@Override
	public void show() {
		System.out.println("Hello student_2");
		
	}

}
