package com.tuoniao.springbootconsumer.service.impl;

import com.entity.Book;
import com.tuoniao.springbootconsumer.dao.BookDao;
import com.tuoniao.springbootconsumer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@Service
public class BookServiceInpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public Book getBook(String id) {
        return bookDao.getBook(id);
    }

}
