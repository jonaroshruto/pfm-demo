package com.example.pfmdemo.service;

import com.example.pfmdemo.model.User;

import java.util.List;

public interface UserRegService {


    void saveUser(User user);

    User findByEmailAddress(String emailAddress);
    List<User> findAllUsers();
}
