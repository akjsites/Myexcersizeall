package com.example.operation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.product;
@Component
public class update {
	
     @Autowired
     private NamedParameterJdbcTemplate namedpjt;
     public void updatedata(product p)
     {
    	 Map< String, Object> map=new HashMap<>();
    	 map.put("bookId", p.getBookId());
    	 map.put("title", p.getTitle());
    	 map.put("author", p.getAuthor());
    	 map.put("category", p.getCategory());
    	 map.put("availableStatus", p.getAvailableStatus());
 
    	 
    	 int update = namedpjt.update("update  product set title= :title,author=:author,category=:category,availableStatus=:availableStatus where bookId=:bookId",map );
     if(update>0)
     {
    	 System.out.println("one Row Updated "+update);
     }
     else {
    	 System.out.println("No Row Updated "+update);
     }
     }
     
}
