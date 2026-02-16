package com.onet.service;

import java.util.List;

import com.onet.entity.Post;

public interface PostService {
    Post createPost(Post post);
    List<Post> getAllPosts();
}
