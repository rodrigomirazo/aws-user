package com.aws.dev.cert.user.service;


import com.aws.dev.cert.user.entity.User;

import java.util.List;

public interface UserService {

    public User findById(String userID);

    public List<User> get();

    public User update(User user);

    public void delete(User user);

    public void deleteById(String id);

}
