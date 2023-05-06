package com.example.usertestmockito.Dao;

import com.example.usertestmockito.model.User;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> userList;

    public UserDaoImpl(/*List<User> userList*/) {
        this.userList = Arrays.asList(
                new User("Петя", 23),
                new User("Коля", 14),
                new User("Данил",35));
    }

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public User getUserByName(String name){
        for (User user: userList) {
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers(){
        return userList;
    }

}
