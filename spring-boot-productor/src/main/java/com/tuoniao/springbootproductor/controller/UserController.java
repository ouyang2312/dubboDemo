package com.tuoniao.springbootproductor.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@RestController
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("get")
    public User get(String id){
        User user = service.getUser(id);
        return user;
    }
}
