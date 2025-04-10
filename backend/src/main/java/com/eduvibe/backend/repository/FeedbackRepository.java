package com.eduvibe.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eduvibe.backend.model.Feedback;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}
