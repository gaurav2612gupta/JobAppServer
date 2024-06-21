package com.example.jobApp.service;

import com.example.jobApp.dao.UserRepo;
import com.example.jobApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user);
    }

}
