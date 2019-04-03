package com.tuoniao.springbootconsumer.controller;

import com.entity.Book;
import com.tuoniao.springbootconsumer.service.BookService;
import com.tuoniao.springbootconsumer.service.impl.UserServiceForComsumer;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("list")
    public List<Book> list(@RequestParam("limitStart") int limitStart,@RequestParam("limitEnd") int limitEnd){
        List<Book> books = bookService.listBook(limitStart, limitEnd);
        return books;
    }

    @PostMapping("add")
    public String add(@RequestBody Book book){
        bookService.addBook(book);
        return "添加成功！";
    }

    @PutMapping("update")
    public String update(@RequestBody Book book){
        bookService.updateBook(book);
        return "修改成功！";
    }
}
