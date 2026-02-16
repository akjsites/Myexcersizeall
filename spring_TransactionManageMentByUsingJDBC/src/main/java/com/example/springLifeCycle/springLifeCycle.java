package com.example.springLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class springLifeCycle {

	public springLifeCycle() {
		super();
		System.out.println("Bean Object");
	}
    @PostConstruct
	public void init()
	{
		System.out.println("Spring Bean Object Will Be created");
	}
    
	public void servise()
	{
		System.out.println("Business Logic Cunduct");
	}
    @PreDestroy
	public void destroy()
	{
		System.out.println("Spring Bean Object Will Be destroye");
	}
}
