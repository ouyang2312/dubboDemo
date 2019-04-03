package com.tuoniao.springbootconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.entity.User;
import org.springframework.stereotype.Service;
import com.service.UserService;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@Service
public class UserServiceForComsumer{

    @Reference(check = false)
    UserService userService;

    /**
     * dubbo调用提供者的服务
     * @author oy
     * @date 2019/3/31
     * @param id
     * @return com.entity.User
     */
    public User getUser(String id){
        User user = userService.getUser(id);
        return user;
    }

}
