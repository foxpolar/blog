package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
