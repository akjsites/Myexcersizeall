package com.example.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class user {
    @Autowired
    mail support;


	public void setSupport(mail support) {
		this.support = support;
	}
    public void check(String msg)
    {
    	     support.support(msg);
    	     System.out.println(support.getMsg());
    }
}
