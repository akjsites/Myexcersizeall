package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext aa=new AnnotationConfigApplicationContext(springDriver.class);
		JdbcTemplate man = aa.getBean(JdbcTemplate.class);
		String id="1001";
		String room="2001";
		float sal=100000f;
		String que="insert into student values(?)";
        int update = man.update(que,id);
        if(update>0)
        {
        	 System.out.println(update+" Row Inserted");
        }
        else {
        	System.out.println(update+" No Row Inserted");
        }
//		String que="select * from manager";
//		List<Map<String,  Object>> queryForList = man.queryForList(que);
//		Iterator<Map<String, Object>> iterator = queryForList.iterator();
//		while(iterator.hasNext())
//		{
//			Map<String, Object> manage = iterator.next();
//			Set<Entry<String, Object>> entrySet = manage.entrySet();
//			Iterator<Entry<String, Object>> iterator2 = entrySet.iterator();
//			while(iterator2.hasNext())
//			{
//				Entry<String, Object> next = iterator2.next();
//				System.out.println(next.getKey()+" "+next.getValue());
//			}
//				
//		}
	}

}
