package com.eduvibe.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "posts")
public class PostUpload {

    @Id
    private String id;
    private String userId;
    private String content;
    private String mediaUrl;
    private Date createdAt;
    private Date updatedAt;

    // Default constructor
    public PostUpload() {}

    // All-args constructor
    public PostUpload(String id, String userId, String content, String mediaUrl, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
