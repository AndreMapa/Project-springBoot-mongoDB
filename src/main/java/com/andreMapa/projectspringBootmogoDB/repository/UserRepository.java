package com.andreMapa.projectspringBootmogoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andreMapa.projectspringBootmogoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
