package com.example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class orderservi {
    @Autowired
	order o;
    public void validamount()
    {
    	     o=new order("011Aswini", "Aswini", 10000.00, 7, "PRIME");
    	     if(o.getTotalAmount()<0)
    	     {
    	    	     System.exit(0);
    	     }
    }
    public void printdispaly()
    {
    	    o.applydiscount(); 
    }
    
}
