package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisCalculator {
       public LocalDate date;
       public double price;
       
       public DisCalculator(LocalDate date, double price) {
		
		this.date = date;
		this.price = price;
	}

	   public void show()
       {
    	   LocalDate now = LocalDate.now();
    	   DayOfWeek dayOfWeek = now.getDayOfWeek();
    	    double bal=(dayOfWeek.equals("saturday") ||dayOfWeek.equals("sunday"))? this.price-(this.price*0.9) :  price-(price*0.8);
        if(dayOfWeek.equals("saturday") ||dayOfWeek.equals("sunday"))
        {
        	    System.out.println("discount price is 90 "+bal);
        	    
        }
        else
        {
        	    System.out.println("discount price is 80 "+bal);
        	    
        }
       }
       
}
