package com.example.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.student;

@Component
public class insert {
	@Autowired
	@Qualifier("getTamplate")
	private JdbcTemplate jdbstemp;

	public void InsertData(String id, String name, float marks) {

		student s = new student(id, name, marks);
		String querry = "insert into student values(?,?,?)";
		int update = jdbstemp.update(querry, s.getId(), s.getName(), s.getMarks());
		if (update > 0) {
			System.out.println(update + " Data Inserted");
		} else {
			System.out.println(update + " Data Inserted");
		}

	}
}
