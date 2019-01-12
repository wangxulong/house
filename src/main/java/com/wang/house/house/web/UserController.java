package com.wang.house.house.web;

import com.wang.house.house.dao.UserDao;
import com.wang.house.house.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("add")
    public User add(User user) {
        userDao.saveUser(user);
        return user;
    }

    @GetMapping("index")
    public String add(ModelMap model) {
        User user = new User();
        user.setName("王旭龙");
        model.put("user",user);
       return "index";
    }


}
