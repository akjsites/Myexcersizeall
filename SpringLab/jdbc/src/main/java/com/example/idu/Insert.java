package com.example.idu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.example.demo.JdbcDriver;
@Component
public class Insert {

	public void InsertData(Integer id,String name) throws SQLException
	{
		Connection con = JdbcDriver.con;
		PreparedStatement std1 = con.prepareStatement("insert into std1 values(?,?)");
		std1.setInt(1, id);
		std1.setString(2, name);
		int n = std1.executeUpdate();
		if(n==1)
		{
			System.out.println( n+" Data inserted");
		}

	}
}
