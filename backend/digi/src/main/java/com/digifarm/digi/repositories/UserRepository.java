package com.digifarm.digi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.digifarm.digi.models.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
