package Qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class LightMore implements Qulifier {

	@Autowired
	@Qualifier("electryCity")
	sourse sourse;
	
	@Override
	public void apliance() {
		System.out.println("I am Light");
		sourse.sourse();
	}

	

}
