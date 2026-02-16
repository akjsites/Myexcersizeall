package engine;

import org.springframework.stereotype.Component;

@Component
public class engine {


	String name;

	Integer km;

	Integer Distance;

	String enginemodel;


	public engine() {}
	public engine(String name, Integer km, Integer distance, String enginemodel) {
		super();
		this.name = name;
		this.km = km;
		Distance = distance;
		this.enginemodel = enginemodel;
	}
     
	

	public String getName() {
		return name;
	}




	public Integer getKm() {
		return km;
	}




	public Integer getDistance() {
		return Distance;
	}




	public String getEnginemodel() {
		return enginemodel;
	}




	




	public String applydiscount()
	{   String message=null;
	
		if(this.enginemodel.equals("Disel"))
			
		{
			Integer zzz=(km*Distance)+(km*Distance)/100*5;
			message= ""+zzz;
		}
		else
		{
		   message="unrecable";
		}
		return message;

	}

}
