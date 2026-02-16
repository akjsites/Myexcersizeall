package com.demo.payment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     @Bean
     public CreditCardPayment CreditCardPayment()
     {
    	 return new CreditCardPayment();
     }
     @Bean
     public DebitCardPayment DebitCardPayment()
     {
    	 return new DebitCardPayment();
     }
     @Bean
     public UPIPayment UPIPayment()
     {
    	 return new UPIPayment();
     }
     @Bean
     public PaymentService PaymentService()
     {
    	 return new PaymentService();
     }
}
