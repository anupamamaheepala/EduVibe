package com.eduvibe.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedbacks")
public class Feedback {
    @Id
    private String id;
    private String name;
    private String message;

    // Getters and setters
}
