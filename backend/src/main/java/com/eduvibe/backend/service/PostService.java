package com.eduvibe.backend.service;

import com.eduvibe.backend.model.PostUpload;
import com.eduvibe.backend.repository.PostUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostUploadRepository PostUploadRepository;

    public PostUpload createPost(PostUpload post) {
        post.setCreatedAt(new Date());
        post.setUpdatedAt(new Date());
        return PostUploadRepository.save(post);
    }

    public List<PostUpload> getAllPosts() {
        return PostUploadRepository.findAll();
    }
}
