package com.example.practice.com.example.practice.setterInjection$Field;

import org.springframework.beans.factory.annotation.Autowired;


public class appConfig {

	private manager manager;
	
	
	public void setManager(manager manager) {
		this.manager = manager;
	}


	public void display()
	{
		System.out.println(manager.toString());
	}
}
