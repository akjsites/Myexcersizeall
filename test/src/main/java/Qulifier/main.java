package Qulifier;

import java.util.ResourceBundle.Control;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(Coltrol.class);
		Coltrol light = a.getBean(Coltrol.class);
		light.display();
	    

	}

}
