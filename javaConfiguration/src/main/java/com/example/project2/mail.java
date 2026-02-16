package com.example.project2;

import org.springframework.stereotype.Component;

@Component
public class mail {

	String msg;
	public void support(String msg)
	{
		if(msg==null)
		{
			System.out.println("product un Availeble");
		}
		else {
			this.msg=msg;
		}
	}
	public String getMsg() {
		return msg;
	}
	
}
