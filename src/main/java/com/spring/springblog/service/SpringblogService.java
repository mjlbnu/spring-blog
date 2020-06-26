package com.spring.springblog.service;

import com.spring.springblog.Model.Post;

import java.util.List;

public interface SpringblogService {

  List<Post> findAll();
  Post findById(long id);
  Post save(Post post);
}
