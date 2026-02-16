package com.example.idu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.example.demo.JdbcDriver;
@Component
public class Select {

	public void select() throws SQLException
	{
		Connection con = JdbcDriver.con;
		PreparedStatement std1 = con.prepareStatement("select * from std1");
		ResultSet a = std1.executeQuery();
		while(a.next())
		{
			System.out.println(a.getInt(1)+" "+a.getString(2));
		}
	}
}
