package engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Serviceengine {
    @Autowired
	engine e;
    String applydiscount=null;
    public void validamount()
    {
    	     e=new engine("HONDA", 75, 20, "Disel");
    	     if(e.getDistance()<0)
    	     {
    	    	     System.exit(0);
    	     }
    	     if(e.getKm()<0)
    	     {
    	    	     System.exit(0);
    	     }
    	     
    }
    public void printdispaly()
    {
    	    applydiscount = e.applydiscount(); 
    }
    public void print()
    {
    	   System.out.println(applydiscount);
    	   System.out.println(e.getName());
    	   System.out.println(e.getKm());
    	   System.out.println(e.getDistance());
    	   System.out.println(e.getEnginemodel());
    }
    
}
