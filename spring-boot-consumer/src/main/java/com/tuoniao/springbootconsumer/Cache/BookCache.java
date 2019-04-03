package com.tuoniao.springbootconsumer.Cache;

import com.entity.Book;
import com.tuoniao.springbootconsumer.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author oy
 * @description
 * @date 2019/4/3
 */

@Component
@CacheConfig(cacheNames = "Book")
public class BookCache {

    @Autowired
    private BookDao bookDao;

    @Cacheable(value="book")//,key = "'list_'+#pageStart+'_'+#pageSize"
    public List<Book> list(int pageStart,int pageSize){
        List<Book> books = bookDao.listBook(pageStart, pageSize);
        return books;
    }

    @CachePut(value = "book")
    public void add(Book book){
        bookDao.addBook(book);
    }

    @CachePut(value = "book")
    public void udpate(Book book){
        bookDao.updateBook(book);
    }

    @Cacheable(value = "book")
    public void get(String id){
        bookDao.getBook(id);
    }
}
