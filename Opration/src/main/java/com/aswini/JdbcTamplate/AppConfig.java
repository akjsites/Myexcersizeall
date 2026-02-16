package com.aswini.JdbcTamplate;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan("com")
public class AppConfig {

	@Bean
	public DriverManagerDataSource getdata()
	{
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/aswini");
		d.setUsername("root");
		d.setPassword("2004");
		return d;
	}
	@Bean
	public NamedParameterJdbcTemplate getTamplate()
	{
		return new NamedParameterJdbcTemplate(getdata());

	}
	
}
