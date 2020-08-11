package com.oracle.hrb.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class ProviderDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDaoApplication.class, args);
    }

}
