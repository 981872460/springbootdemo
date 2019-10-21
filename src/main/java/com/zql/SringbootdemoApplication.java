package com.zql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zql.common.dao")
public class SringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SringbootdemoApplication.class, args);
    }

}
