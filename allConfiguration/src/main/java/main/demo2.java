package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class demo2 {
	@Bean
   public demo1 getdata()
   {
	   return new demo1();
   }
}
