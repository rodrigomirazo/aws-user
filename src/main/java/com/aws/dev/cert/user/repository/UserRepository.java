package com.aws.dev.cert.user.repository;

import java.util.List;

import com.aws.dev.cert.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

}
