package com.ncvt.medicawebweb;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//scanBasePackages ={"com.ncvt.medicawebdao.dao","com.ncvt.medicawebweb"}
@MapperScan("com.ncvt.medicawebdao.dao")
@SpringBootApplication()
public class MedicawebWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicawebWebApplication.class, args);
    }

}
