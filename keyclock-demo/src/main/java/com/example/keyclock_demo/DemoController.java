package com.example.keyclock_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/keyclock")
public class DemoController {

    @GetMapping("/hello1")
    public String hello(){
        return "Hello World!!!";
    }

    @GetMapping("hello2")
    public String hello2(){
        return "Hello Admin";
    }

}
