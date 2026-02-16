package com.example.springLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
   public static void main(String[] args) {
    AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
    springLifeCycle bean = a.getBean(springLifeCycle.class);
    bean.servise();
    bean.destroy();
}
}
