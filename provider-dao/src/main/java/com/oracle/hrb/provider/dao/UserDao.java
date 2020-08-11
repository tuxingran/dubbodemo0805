package com.oracle.hrb.provider.dao;

import com.oracle.hrb.provider.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {


    List<User> findAll();


}
