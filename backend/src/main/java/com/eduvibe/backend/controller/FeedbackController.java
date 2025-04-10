package com.eduvibe.backend.controller;

import com.eduvibe.backend.model.Feedback;
import com.eduvibe.backend.repository.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}
