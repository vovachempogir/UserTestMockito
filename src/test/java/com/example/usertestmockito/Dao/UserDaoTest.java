package com.example.usertestmockito.Dao;

import com.example.usertestmockito.model.User;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    private User userForTest = new User("Петя", 23);


    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test
    void shouldGetUserByNameReturnUser() {
        Assertions.assertEquals(userDaoImpl.getUserByName("Петя"), userForTest);
    }

    @Test
    void shouldFindAllUsers() {
        Assertions.assertNull(userDaoImpl.getUserByName("Слава"));
    }

    @Test
    void shouldFindAllUsers1() {
        Assertions.assertNotNull(userDaoImpl.getUserByName("Коля"));
    }
}
