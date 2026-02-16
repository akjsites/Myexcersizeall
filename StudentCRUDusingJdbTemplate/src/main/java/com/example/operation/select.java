package com.example.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.student;

@Component
public class select {
	@Autowired
	@Qualifier("getTamplate")
	private JdbcTemplate jdbstemp;

	public void SelectData() {
		String querry = "select * from student";
		List<student> query = jdbstemp.query(querry, (rs, a) -> {
			student s = new student(rs.getString(1), rs.getString(2), rs.getFloat(3));
			return s;
		});
		for (student student : query) {
			System.out.println(student.getId() + " " + student.getName() + " " + student.getMarks());
		}

	}
}
