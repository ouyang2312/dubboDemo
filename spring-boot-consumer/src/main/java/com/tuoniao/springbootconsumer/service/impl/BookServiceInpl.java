package com.tuoniao.springbootconsumer.service.impl;

import com.entity.Book;
import com.tuoniao.springbootconsumer.Cache.BookCache;
import com.tuoniao.springbootconsumer.dao.BookDao;
import com.tuoniao.springbootconsumer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@Service
public class BookServiceInpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    BookCache bookCache;

    @Override
    public Book getBook(String id) {
        return bookDao.getBook(id);
    }

    @Override
    public List<Book> listBook(int limitStart, int limitEnd) {
        List<Book> list = bookCache.list(limitStart, limitEnd);
        return list;
    }

    @Override
    public void addBook(Book book) {
        bookCache.add(book);
    }

    @Override
    public void updateBook(Book book) {
        bookCache.udpate(book);
    }



}
