package com.eduvibe.backend;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BackendApplication {

    @Autowired
    private MongoClient mongoClient;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @PostConstruct
    public void testMongoConnection() {
        try {
            MongoDatabase db = mongoClient.getDatabase("eduvibe"); // replace with your DB name
            db.listCollectionNames().first(); // just to trigger a call
            System.out.println(" Successfully connected to MongoDB database: eduvibe");
        } catch (Exception e) {
            System.err.println(" Failed to connect to MongoDB: " + e.getMessage());
        }
    }
}
