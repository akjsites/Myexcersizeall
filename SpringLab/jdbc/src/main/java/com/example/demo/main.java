package com.example.demo;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.idu.Delete;
import com.example.idu.Insert;
import com.example.idu.Select;
import com.example.idu.Update;
@ComponentScan("com.example.idu")
public class main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext a=new AnnotationConfigApplicationContext(main.class);
        while(true)
        {
        	System.out.println("Enter Your Number You Want To Operation "
            		+ "1.Insert"
        			+ "2.select"
            		+ "3.delete"
            		+ "4.update"
            		+ "5.exit");
        	Scanner sc = new Scanner(System.in);
        	int num = sc.nextInt();
        	switch(num)
        	{
        	case  1->{
        		System.out.println("Enter Your Id: ");
        		Integer id=sc.nextInt();
        		System.out.println("Enter Your Name: ");
        		String name=sc.next();
        		Insert std = a.getBean(Insert.class);
        		std.InsertData(id, name);
        		}
        	case  2->{
        		Select std = a.getBean(Select.class);
        		std.select();
        		}
        	case  3->{
        		System.out.println("Enter Your Id: ");
        		Integer id=sc.nextInt();
        		Delete std = a.getBean(Delete.class);
        		std.DeleteData(id);
        		}
        	case  4->{
        		System.out.println("Enter Your Id: ");
        		Integer id=sc.nextInt();
        		
        		System.out.println("Enter Your Name: ");
        		String name=sc.next();
        		Update std = a.getBean(Update.class);
        		std.UpdateData(id, name);
        		}
        	case  5->{
        		System.exit(0);
        		}
        	}
        }
		    
	}
 
}
