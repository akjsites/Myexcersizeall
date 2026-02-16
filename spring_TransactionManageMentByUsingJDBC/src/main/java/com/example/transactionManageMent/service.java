package com.example.transactionManageMent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class service {

	@Autowired
	transactionRepositary repo;
	public String insertverify(user user)
	{
		String msg = repo.CreateAccount(user);
		return msg;
	}
	public user selectverify(user user)
	{
		user msg = repo.sowData(user);
		return msg;
	}
	public void transactionverify(String sender,String reciver,float bal)
	{
		repo.transaction(sender, reciver, bal);
		
	}
}
