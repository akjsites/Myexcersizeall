package fieldinjectionthrowjavabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(bean.class);
    	  appconfig appconfig = a.getBean(appconfig.class);
    	  System.out.println(appconfig.std);
	}
    
}
