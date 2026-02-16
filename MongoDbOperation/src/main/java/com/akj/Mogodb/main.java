package com.akj.Mogodb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;

public class main {
   public static void main(String[] args) {
	monogoMetaData mongo=new monogoMetaData();
	MongoCollection<Document> data = mongo.getData();
	Document d=new Document().append("name", "Aswini").append("rollnumber", "2000");
	
}
}
