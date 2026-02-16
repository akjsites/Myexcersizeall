package com.aswini.JdbcTamplate;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class operation {


    
    @Autowired
    NamedParameterJdbcTemplate  NamedParameterJdbcTemplate;

    public void insertdata(student student)
    {
    	Map< String, String> std=new HashMap<>();
    	std.put("id", "1000");
    	try {
    	int update = NamedParameterJdbcTemplate.update("insert into std values(:id)",std);
    	
    	if(update>=0)
    	{
    		System.out.println("insert sucessfully");
    	}
    	}
    	catch (Exception e) {
    		System.out.println("insert Not Sucessfully");
		}
    }
    public void selectData(String id)
    {
    	Map< String, String> std=new HashMap<>();
    	std.put("id", id);
      student studnet = NamedParameterJdbcTemplate.queryForObject("select * from std where id=:id", std, new BeanPropertyRowMapper<>(student.class));
    	System.out.println(studnet.getId());
    }
    
    public void update(String id,student stdudent)
    {
    	Map< String, Object> std=new HashMap<>();
    	std.put("id", id);
    	std.put("idchange", stdudent.getId());
    	int update = NamedParameterJdbcTemplate.update("update std set id=:idchange where id=:id",std);
    	
    	if(update>=0)
    	{
    		System.out.println("Update sucessfully");
    	}
    	else {
    		System.out.println("Update Not Sucessfully");
    	}
    }
    public void delete(student student)
    {
    	Map< String, String> std=new HashMap<>();
    	std.put("id", student.getId());
    	int update = NamedParameterJdbcTemplate.update("delete from std where id=:id",std);
    	
    	if(update>=0)
    	{
    		System.out.println("delete sucessfully");
    	}
    	else {
    		System.out.println("delete Not Sucessfully");
    	}
    }
}
