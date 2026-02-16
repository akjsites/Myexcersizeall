package com.akj.Hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Who {
  public static List<Hospital> hospital=new ArrayList<>();
  public  void hadd(Hospital h) {
	  hospital.add(h);
	 
  
}
  public void show()
  {
	    Iterator<Hospital> i = hospital.iterator();
	    while(i.hasNext())
	    {
	    	Hospital next = i.next();
	    	System.out.println(next.toString()+" "+next.ID()+" "+next.Location());
	    }
  }
}
