package com.example.idu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.example.demo.JdbcDriver;
@Component
public class Delete {

	public void DeleteData(Integer id) throws SQLException
	{
		Connection con = JdbcDriver.con;
		PreparedStatement std1 = con.prepareStatement("delete from std1 where id=?");
		std1.setInt(1, id);
		int n = std1.executeUpdate();
		if(n==1)
		{
			System.out.println( n+" Data deleted");
		}

	}
}
