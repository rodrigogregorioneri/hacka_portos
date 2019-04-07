package com.importsolutions.hackaton.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.importsolutions.hackaton.repository.UserRepository;
import com.importsolutions.hackaton.security.entity.User;

/**
 * Created by NeriDev on 05/06/2018.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User createUser(User user) {
        System.out.println(user.getEmail());
         return repository.save(user);
    }
    
    
    public User findByEmail(String email) {
        return repository.findByEmail(email);
   }
}