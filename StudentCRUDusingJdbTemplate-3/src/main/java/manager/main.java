package manager;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.product;
import com.example.operation.MysqlDb;
import com.example.operation.delete;
import com.example.operation.insert;
import com.example.operation.select;
import com.example.operation.update;


public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext(MysqlDb.class);
//		insert insert = a.getBean(insert.class);
//		insert.insertdata(new product("1002", "JSBean", "Jem", "Spring", 1604,LocalDate.now()));
		
	    select select = a.getBean(select.class);
		select.selectdata();
		
//		update update = a.getBean(update.class);
//		update.updatedata(new product("1002", "JSBean", "Jem", "SpringBoot", 20004));
		
//		delete delete = a.getBean(delete.class);
//		delete.droprow("1002");

	}

}
