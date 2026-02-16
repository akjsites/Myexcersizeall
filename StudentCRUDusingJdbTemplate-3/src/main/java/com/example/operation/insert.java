package com.example.operation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.product;
@Component
public class insert {
	
     @Autowired
     private NamedParameterJdbcTemplate namedpjt;
     public void insertdata(product p)
     {
    	 Map< String, Object> map=new HashMap<>();
    	 map.put("bookId", p.getBookId());
    	 map.put("title", p.getTitle());
    	 map.put("author", p.getAuthor());
    	 map.put("category", p.getCategory());
    	 map.put("availableStatus", p.getAvailableStatus());
    	 map.put("releseDate", p.getReleseDate());
    	 int insert = namedpjt.update("insert into product values(:bookId,:title,:author,:category,:availableStatus,:releseDate)",map );
     if(insert>0)
     {
    	 System.out.println("one Row Inserted "+insert);
     }
     else {
    	 System.out.println("No Row Inserted "+insert);
     }
     }
     
}
