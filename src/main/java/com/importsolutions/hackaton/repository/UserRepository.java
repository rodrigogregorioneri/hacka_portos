package com.importsolutions.hackaton.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.importsolutions.hackaton.security.entity.User;

/**
 * Created by NeriDev on 05/06/2018.
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
    


}