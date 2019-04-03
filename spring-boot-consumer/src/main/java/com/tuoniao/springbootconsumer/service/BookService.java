package com.tuoniao.springbootconsumer.service;

import com.entity.Book;

import java.util.List;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
public interface BookService {

    public Book getBook(String id);

    public List<Book> listBook(int limitStart, int limitEnd);

    void addBook(Book book);

    void updateBook(Book book);
}
