package com.spring.springblog.service.serviveImpl;

import com.spring.springblog.Model.Post;
import com.spring.springblog.repository.SpringblogRepository;
import com.spring.springblog.service.SpringblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringblogServiceImpl implements SpringblogService {

  @Autowired
  SpringblogRepository springblogRepository;

  @Override
  public List<Post> findAll() {
    return springblogRepository.findAll();
  }

  @Override
  public Post findById(long id) {
    return springblogRepository.findById(id).get();
  }

  @Override
  public Post save(Post post) {
    return springblogRepository.save(post);
  }
}
