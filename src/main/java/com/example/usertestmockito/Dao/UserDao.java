package com.example.usertestmockito.Dao;

import com.example.usertestmockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();

}
