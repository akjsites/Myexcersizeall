package com.example.demo;

import org.springframework.stereotype.Component;

@Component("student1")
public class student1 implements student {

	@Override
	public void show() {
		System.out.println("Hello Student1");
		
	}

	

}
