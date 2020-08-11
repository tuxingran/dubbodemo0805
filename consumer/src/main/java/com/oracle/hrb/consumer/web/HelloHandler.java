package com.oracle.hrb.consumer.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.oracle.hrb.interface2.service.UserService;
import com.oracle.hrb.provider.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloHandler {
    @Reference
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public List<User> hello() {

        return userService.findAll();
    }
}
