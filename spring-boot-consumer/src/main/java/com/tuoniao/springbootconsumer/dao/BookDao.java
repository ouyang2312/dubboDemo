package com.tuoniao.springbootconsumer.dao;

import com.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@Mapper
public interface BookDao {

    @Select("select * from book where id = #{id}")
    @ResultType(Book.class)
    public Book getBook(@Param("id") String id);

}
