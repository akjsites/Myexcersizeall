package com.example.transactionManageMent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class controller {
	

		@Autowired
		service service;
		public String contrillerMainInsert(user user)
		{
			String msg = service.insertverify(user);
			return msg;
		}
		
		public user contrillerMainselect(user user)
		{
			user msg = service.selectverify(user);
			return msg;
		}
		public void contrillerMaintrans(String sender,String reciver,float bal)
		{
			service.transactionverify(sender, reciver, bal);
			
		}
}
