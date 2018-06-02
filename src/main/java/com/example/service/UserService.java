package com.example.service;

import com.example.pojo.User;

public interface UserService {
    public User findUserById(int id) throws Exception;
}
