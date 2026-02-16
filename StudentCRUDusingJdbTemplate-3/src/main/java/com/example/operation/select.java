package com.example.operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.product;
@Component
public class select {
	
     public select() {
		super();
	}
	 @Autowired
     private NamedParameterJdbcTemplate namedpjt;
     public void selectdata()
     {
    	    List<product> product=namedpjt.query("select * from product", new BeanPropertyRowMapper<>(product.class));
    	    for (product p : product) {
				System.out.println(p);
			}
     }
     
}
