package com.example.transactionManageMent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
                      

                      
@Configuration        
@ComponentScan("com") 
public class Appconfig{
    @Bean           
    public DriverManagerDataSource getdata()
    {                 
    	   DriverManagerDataSource a=new DriverManagerDataSource();
    	   a.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	   a.setUrl("jdbc:mysql://localhost:3306/aswini");
    	   a.setUsername("root");
    	   a.setPassword("2004");
    	   return a;
    }
    @Bean
    public NamedParameterJdbcTemplate getData()
    {
    	return new NamedParameterJdbcTemplate(getdata());
    }
}
