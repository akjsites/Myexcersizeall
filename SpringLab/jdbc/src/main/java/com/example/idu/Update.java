package com.example.idu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.example.demo.JdbcDriver;
@Component
public class Update {

	public void UpdateData(Integer id,String name) throws SQLException
	{
		Connection con = JdbcDriver.con;
		PreparedStatement std1 = con.prepareStatement("update std1 set name=? where id=?");
		std1.setString(1, name);
		std1.setInt(2, id);
		int n = std1.executeUpdate();
		if(n==1)
		{
			System.out.println( n+" Data Update");
		}

	}
	
}
