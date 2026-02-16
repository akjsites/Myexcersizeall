package com.akj.Mogodb;

import java.lang.annotation.Documented;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class monogoMetaData {

	public MongoCollection<Document> getData()
	{
	       MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/");
	       MongoDatabase database = mongoClient.getDatabase("ak");
	       MongoCollection<Document> collection = database.getCollection("akj");
	       return collection;
	}
}
