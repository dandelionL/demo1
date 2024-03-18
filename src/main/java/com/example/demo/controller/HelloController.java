package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/visitWeb")
    public @ResponseBody  String visitWeb(){
        logger.info("hello visitWeb!!!");
        return "hello visitWeb";
    }
}
