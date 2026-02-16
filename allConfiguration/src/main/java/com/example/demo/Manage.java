package com.example.demo;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Manage {
    
	Engine e;
    Hashtable< String, String> name=new Hashtable<>();
    Hashtable< String, String> name1=new Hashtable<>();
    Hashtable< String, String> name2=new Hashtable<>();
    Hashtable< String, String> name3=new Hashtable<>();
    @Bean
	public void add() {
		name.put("volvo", "Break");
		e = new Engine("Model1", name);
		name1.put("Bmw", "Break");
		e = new Engine("Model2", name1);
		name2.put("ANR", "Break");
		e = new Engine("Model3", name2);
		name3.put("NR", "Break");
		e = new Engine("Model4", name3);
        Hashtable<String, String> advan = e.getAdvan();
        Set<Entry<String, String>> asw = advan.entrySet();
        Iterator<Entry<String, String>> iterator = asw.iterator();
        while(iterator.hasNext())
        {
        	  Entry<String, String> ele = iterator.next();
        	  System.out.println(ele.getKey()+" "+ele.getValue());
        }
        String engineeCapacity = e.getEngineeCapacity();
        System.out.println(engineeCapacity);
	}
	
}
