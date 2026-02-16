package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class database {
  public Properties prop=new Properties();
  public database(Properties prop)
  {
	  this.prop=prop;
  }
  public void adddata() throws IOException
  {
	  
	  Reader fileinp=new FileReader("A:\\\\db.properties");
	  prop.load(fileinp);
	  System.out.println(prop.getProperty("Num1"));
	  
  }
  
  
  
  
}
