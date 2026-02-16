package com.demo.Engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Enginemain {

	@Autowired
	@Qualifier("DiselEngine")
	Engine enginee;
	public void display()
	{
		enginee.run();
	}
	
	

}
