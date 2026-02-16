package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(demo2.class);
		demo2 bean = a.getBean(demo2.class);
        System.out.println(bean);
	}

}
