package com.example.user.service;

import com.example.user.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUserById(Integer id);
    User getUserByLogin(String login);
    User getUserByEmail(String email);
    User create(User user);
}
