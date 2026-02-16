package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com")
public class app_config {

	@Bean
	public student_1 getstd_1()
	{
		return new student_1();
	}
	
	
	@Bean
	public student_2 getstd_2()
	{
		return new student_2();
	}
}
