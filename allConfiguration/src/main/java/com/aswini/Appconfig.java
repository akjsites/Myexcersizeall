package com.aswini;

import org.springframework.context.annotation.Bean;

public class Appconfig {

	@Bean
	public q1 getq()
	{
		return new q1("1220");
	}
	@Bean
	public student getstudent()
	{
		return new student("Aswini", getq());
	}
}
