package com.example.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;
@Component
public class JdbcDriver {
	public static Connection con;
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aswini","root","Aswini@123");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Tablecreate() throws SQLException
	{
		java.sql.Statement statement = con.createStatement();
		statement.execute("create table std1 (id INT(10),name VARCHAR(10))");
        
	}
	
	

}
