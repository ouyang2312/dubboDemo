package com.tuoniao.springbootproductor.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @ResultType(User.class)
    @Select("select * from user where id = #{id}")
    public User getUser(@Param("id") String id);

}
