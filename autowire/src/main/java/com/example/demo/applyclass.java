package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class applyclass {

	students std;

	@Autowired
	public  applyclass(@Qualifier("student_1") students std) {
		this.std = std;
	}

	public void show() {
		std.show();
	}
}
