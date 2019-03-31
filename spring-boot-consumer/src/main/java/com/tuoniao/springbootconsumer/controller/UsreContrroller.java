package com.tuoniao.springbootconsumer.controller;

import com.entity.Book;
import com.tuoniao.springbootconsumer.service.BookService;
import com.tuoniao.springbootconsumer.service.impl.UserServiceForComsumer;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@RestController
public class UsreContrroller {



    @Autowired
    UserServiceForComsumer userServiceForComsumer;

    @Autowired
    BookService bookService;

    @GetMapping("get")
    public User get(@RequestParam("id") String id){
        User user = userServiceForComsumer.getUser(id);
        return user;
    }

    @GetMapping("test")
    public String test(@RequestParam("id") String id){
       return id;
    }


    @GetMapping("book")
    public Book book(@RequestParam("id") String id){
        return bookService.getBook(id);
    }
}
