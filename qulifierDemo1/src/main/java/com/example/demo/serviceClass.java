package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class serviceClass {

	@Autowired
	@Qualifier("student2")
	student student;
	
	public void show()
	{
		 student.show();
	}
	
}
