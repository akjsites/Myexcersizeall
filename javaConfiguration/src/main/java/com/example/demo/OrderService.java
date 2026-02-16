package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	@Autowired
    processManagement process;
    String orderId;
	public OrderService(processManagement process) {
		super();
		this.process = process;
	}
	public void placeOrder(String orderId, double amount)
	{
		process.processPayment(amount);
		System.out.println("Order Sucess fully " +orderId);
	}

}
