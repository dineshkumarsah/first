package com.dineshbhumca.first.repositories;

import com.dineshbhumca.first.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
