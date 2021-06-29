package com.spring.service;

import java.util.List;

import com.spring.model.Post;

public interface PostService {

	List<Post> findAll();

	Post findById(Long id);

	Post save(Post post);

}
