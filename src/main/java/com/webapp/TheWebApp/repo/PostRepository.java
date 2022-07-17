package com.webapp.TheWebApp.repo;

import com.webapp.TheWebApp.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByIdDesc();
}
