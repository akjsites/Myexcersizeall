package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class springDriver {
	@Bean
    public DriverManagerDataSource conn()
    {
		DriverManagerDataSource dd=new DriverManagerDataSource();
		dd.setDriverClassName("org.postgresql.Driver");
		dd.setUrl("jdbc:postgresql://localhost:7777/aswini");
		dd.setUsername("aswini");
		dd.setPassword("2004");
		return dd;
    }
	@Bean
	public JdbcTemplate gettemplate()
	{
		return new JdbcTemplate(conn());
	}
}
