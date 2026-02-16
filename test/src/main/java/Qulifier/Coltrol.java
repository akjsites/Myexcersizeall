package Qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("Qulifier")
public class Coltrol {

	@Autowired
	@Qualifier("lightMore")
	Qulifier qulifier;
	public void display()
	{
		qulifier.apliance();
	}
	
}
