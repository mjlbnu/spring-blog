package com.spring.springblog.repository;

import com.spring.springblog.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringblogRepository extends JpaRepository<Post, Long> {
}
