package com.ncvt.medicawebweb.controller;

import com.ncvt.medicawebdao.dao.productInfoMapper;
import com.ncvt.medicawebprojo.projo.productInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    productInfoMapper prodao;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/product")
    public List<productInfo> product(){
        return prodao.selectByExample(null);
    }


}
