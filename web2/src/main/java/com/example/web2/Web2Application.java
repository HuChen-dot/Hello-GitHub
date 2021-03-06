package com.example.web2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
@MapperScan("com.example.base.Dao.mapper")
class Web2Application {

    public static void main(String[] args) {
        SpringApplication.run(Web2Application.class, args);
    }

}
