package com.spring.cloud.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping("/name")
    public String sayHello() {
        return "Its a hello";
    }

}