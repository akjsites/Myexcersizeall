package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class repositaryClass {
	@Autowired
	JdbcTemplate jtemp;

	public double Fromvalid(long from) {
		user user = jtemp.queryForObject("select balance from banktransfer where bankId=?", new BeanPropertyRowMapper<>(user.class), from);
		return user.getBalance();
	}

	public double tovalid(long to) {
		user user = jtemp.queryForObject("select balance from banktransfer where bankId=?", new BeanPropertyRowMapper<>(user.class), to);
		return user.getBalance();
	}

	public void debit(Long from, double Balance) {
		int update = jtemp.update("update banktransfer set balance=balance-? where bankId=?", Balance, from);
		if (update > 0) {
			System.out.println("Debited Sucessfully");
		} else {
			System.out.println("Debited Fail");
		}
	}

	public void credit(Long to, double Balance) {
		int update = jtemp.update("update banktransfer set balance=balance+? where bankId=?", Balance, to);
		if (update > 0) {
			System.out.println("Credited Sucessfully");
		} else {
			System.out.println("Credited Fail");
		}
	}
}
