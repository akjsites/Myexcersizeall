package com.example.transactionManageMent;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class transactionRepositary {
    @Autowired
    private NamedParameterJdbcTemplate param;
    public String CreateAccount(user user)
    {
    	String msg=null;
    	    Map< String, Object> map=new HashMap<>();
    	    map.put("accountNumber", user.getAccountNumber());
    	    map.put("customerName", user.getCustomerName());
    	    map.put("accountType", user.getAccountType());
    	    map.put("Balance", user.getBalance());
    	    int insert = param.update("insert into bank values(:accountNumber,:customerName,:accountType,:Balance)", map);
    	    if(insert>0)
    	    {
    	    	msg="Update Sucessfully";
    	    }
    	    else
    	    {
    	    	msg="Update Fail";
    	    }
    	    return msg;
    }
    public user sowData(user user)
    {
    	    Map< String, Object> map=new HashMap<>();
    	    map.put("accountNumber", user.getAccountNumber());
    	    
    	    user show = param.queryForObject("select * from bank where accountNumber=:accountNumber", map,new BeanPropertyRowMapper<>(user.class));
    	  
    	    return show;
  
    }
    public void transaction(String sender,String reciver,float bal)
    {
    	    
    	    Map< String, Object> userx=new HashMap<>();
    	    userx.put("userx", sender);
    	    userx.put("bal", bal);
    	    Map< String, Object> usery=new HashMap<>();
    	    usery.put("usery", reciver);
    	    usery.put("bal", bal);
    	    int update = param.update("update bank set Balance=Balance-:bal where accountNumber=:userx", userx);
    	    int update2 = param.update("update bank set Balance=Balance+:bal where accountNumber=:usery", usery);
    	  
    	    if(update>0 && update2>0)
    	    {
    	    	 System.out.println("Transaction sucessfully");
    	    }
    	    else {
    	    	
    	    	System.out.println("Transaction Fail");
    	    }
  
    }
}


