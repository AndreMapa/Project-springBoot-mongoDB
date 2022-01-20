package com.andreMapa.projectspringBootmogoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andreMapa.projectspringBootmogoDB.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
