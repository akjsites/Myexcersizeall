package com.example.demo;

import org.springframework.stereotype.Component;

@Component("student2")
public class student2 implements student {

	@Override
	public void show() {
		System.out.println("Hello Student2");
	}

}
