package com.example.operation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan("com.example.operation")
public class MysqlDb {
	public MysqlDb() {
	}

	@Bean
	public DriverManagerDataSource getdata() {
		DriverManagerDataSource dd = new DriverManagerDataSource();
		dd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dd.setUrl("jdbc:mysql://localhost:3306/aswini");
		dd.setUsername("akj");
		dd.setPassword("2004");
		return dd;
	}

	@Bean
	public NamedParameterJdbcTemplate getTamplate() {
		return new NamedParameterJdbcTemplate(getdata());
	}
}
