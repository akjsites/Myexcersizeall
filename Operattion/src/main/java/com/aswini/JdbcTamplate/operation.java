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
    NamedParameterJdbcTemplate  jdbcTemp;

    public void insertdata(employees emp)
    {
    	Map< String ,Object> map=new HashMap<>();
    	map.put("id", emp.getId());
    	map.put("name", emp.getName());
    	map.put("adress", emp.getAdress());
    	int insert = jdbcTemp.update("insert into operation values(:id,:name,:adress)",map);
         if(insert>0)
         {
        	 System.out.println("Insert sucess fully");
         }
         else
         {
        	 System.out.println("Insert fail");
         }
    	
    }
    public void selectData(String id)
    {
    Map< String ,Object> map=new HashMap<>();
    	map.put("id", id);
     employees emp = jdbcTemp.queryForObject("select * from operation where id=:id",map,new BeanPropertyRowMapper<>(employees.class));
     System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAdress());
    }
    
    public void update(employees emp)
    {
    	Map< String ,Object> map=new HashMap<>();
    	map.put("id", emp.getId());
    	map.put("name", emp.getName());
    	map.put("adress", emp.getAdress());
    	int update = jdbcTemp.update("update operation set name=:name, adress=:adress where id=:id",map);
    	if(update>0)
    	{
    		System.out.println("Update Sucessfully");
    	}
    	else {
    		System.out.println("Update Fail");
    	}
    }
    public void delete(String id)
    {
    	Map< String ,Object> map=new HashMap<>();
    	map.put("id", id);
    	int delete = jdbcTemp.update("delete from operation where id=:id",map);
    	
    	if(delete>=0)
    	{
    		System.out.println("delete sucessfully");
    	}
    	else {
    		System.out.println("delete Not Sucessfully");
    	}
    }
}
