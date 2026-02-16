package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@ComponentScan("com")
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DriverManagerDataSource getdata() {
		DriverManagerDataSource dd = new DriverManagerDataSource();
		dd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dd.setUrl("jdbc:mysql://localhost:3306/aswini");
		dd.setUsername("root");
		dd.setPassword("2004");
		return dd;
	}

	@Bean
	public JdbcTemplate getjdbc() {
		return new JdbcTemplate(getdata());
	}

	@Bean
	public PlatformTransactionManager gettransaction() {
		return new DataSourceTransactionManager(getdata());
	}

}
