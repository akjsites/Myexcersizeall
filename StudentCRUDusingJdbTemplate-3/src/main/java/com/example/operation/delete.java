package com.example.operation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.product;
@Component
public class delete {
	
     @Autowired
     private NamedParameterJdbcTemplate namedpjt;
     public void droprow(String p)
     {
    	 Map< String, Object> map=new HashMap<>();
    	 map.put("bookId", p);
    	 int insert = namedpjt.update("delete  from product where bookId=:bookId",map );
     if(insert>0)
     {
    	 System.out.println("one Row row Drop "+insert);
     }
     else {
    	 System.out.println("No Row Row Drop "+insert);
     }
     }
     
}
