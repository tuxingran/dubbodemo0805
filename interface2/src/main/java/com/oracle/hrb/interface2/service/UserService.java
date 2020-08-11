package com.oracle.hrb.interface2.service;

import com.oracle.hrb.provider.pojo.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;


public interface UserService {


    List<User> findAll();

}
