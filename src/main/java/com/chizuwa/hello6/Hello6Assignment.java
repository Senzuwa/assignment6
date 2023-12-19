package com.chizuwa.hello6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello6Assignment {

    @GetMapping("/hello")
    public String hello(){
        return "hello chizuwa";
    }

    @DeleteMapping("/hello")
    public String deleteHello(){
        return "delete hello";
    }
}
