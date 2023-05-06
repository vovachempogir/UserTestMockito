package com.example.usertestmockito.service;

import com.example.usertestmockito.Dao.UserDaoImpl;
import com.example.usertestmockito.model.User;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }


    @Override
    public boolean checkUserExist (User user){
        return userDaoImpl.getUserList().contains(user);
    }
}
