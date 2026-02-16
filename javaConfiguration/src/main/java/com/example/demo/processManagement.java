package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class processManagement {
	public void processPayment(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Amount is insufficiant");
		}
	}
}
