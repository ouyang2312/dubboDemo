package com.tuoniao.springbootconsumer.dao;

import com.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@Mapper
public interface BookDao {

    @Select("select * from book where id = #{id}")
    @ResultType(Book.class)
    Book getBook(@Param("id") String id);


    @Select("select * from book order by id asc limit #{pageStart},#{pageSize}")
    @ResultType(Book.class)
    List<Book> listBook(@Param("pageStart") int pageStart,@Param("pageSize") int pageSize);

    @Insert("insert into book values(#{id},#{name})")
    void addBook(Book book);

    @Update("update book set name = #{name} where id = #{id}")
    void updateBook(Book book);
}
