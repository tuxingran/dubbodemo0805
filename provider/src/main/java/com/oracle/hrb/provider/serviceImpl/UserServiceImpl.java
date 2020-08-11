package com.oracle.hrb.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.hrb.interface2.service.UserService;
import com.oracle.hrb.provider.dao.UserDao;
import com.oracle.hrb.provider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    public List<User> findAll() {


        return userDao.findAll();
    }


}
