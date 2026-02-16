package com.demo.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class PaymentService {

	@Autowired
	@Qualifier("DebitCardPayment")
	Payment payment;
	public void display()
	{
		payment.payment();
	}
	
	

}
