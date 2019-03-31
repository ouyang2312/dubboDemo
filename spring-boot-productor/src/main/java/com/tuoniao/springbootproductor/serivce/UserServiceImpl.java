package com.tuoniao.springbootproductor.serivce;

import com.alibaba.dubbo.config.annotation.Service;
import com.tuoniao.springbootproductor.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author oy
 * @description
 * @date 2019/3/31
 */
@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUser(String id) {
        User user = userDao.getUser(id);
        return user;
    }

}
