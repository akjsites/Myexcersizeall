package com.onet.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.entity.Post;



@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

