package com.example.Bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class userclass {
	bank b=new bank();
     String user="A";
     @Bean 
     public bank show()
     {
    	    System.out.println(user);
    	    b.show();
    	    return b;
     }
     
}
