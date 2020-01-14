package com.aws.dev.cert.user.service.impl;

import com.aws.dev.cert.user.entity.User;
import com.aws.dev.cert.user.repository.UserRepository;
import com.aws.dev.cert.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public User findById(String userID) {

        return this.userRepo.findById(userID)
                .map(Arrays::asList).map(ArrayList::new)
                .orElseGet(ArrayList::new).get(0);
    }

    @Override
    public List<User> get() {
        return this.userRepo.findAll();
    }

    @Override
    public User update(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public void delete(User user) {
        this.userRepo.delete(user);
    }

    @Override
    public void deleteById(String id) {
        this.userRepo.deleteById(id);
    }
}
