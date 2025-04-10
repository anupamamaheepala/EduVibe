package com.eduvibe.backend.repository;

import com.eduvibe.backend.model.PostUpload;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostUploadRepository extends MongoRepository<PostUpload, String> {
}
