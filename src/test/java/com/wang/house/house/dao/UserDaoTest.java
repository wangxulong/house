package com.wang.house.house.dao;

import com.wang.house.house.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void saveUser() {
        User user = new User();
        user.setName("王旭龙");
        userDao.saveUser(user);
    }
}