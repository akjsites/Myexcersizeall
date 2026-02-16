package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class qulifierconstructor {
	student student;
	@Autowired
	public  qulifierconstructor(@Qualifier("student2") student student)
	{
		this.student=student;
	}
	
	public void show()
	{
		 student.show();
	}
	
}
