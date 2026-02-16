package com.akj.Hospital;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HosHandler {
	@Autowired
	Who w;
    
    
    public void hospitaldataAdd()
    {
    	
    
    	w.hadd(new Hospital("Aswini", 1001, "BBSR"));
    	w.hadd(new Hospital("Aims", 1002, "HB"));
    	w.hadd(new Hospital("Minakhi", 1003, "MB"));
    	w.hadd(new Hospital("MKCH", 1004, "USA"));
    	w.hadd(new Hospital("Bhk", 1005, "INR"));
    w.show();
    }
   
}



