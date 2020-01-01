package com.ncvt.medicawebweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/helloht")
    public String hello(){
        return "Hello.html";
    }
}
