package engine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("engine")
public class main {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
		Serviceengine en = a.getBean(Serviceengine.class);
		en.validamount();
		en.printdispaly();
		en.print();
	}

}
