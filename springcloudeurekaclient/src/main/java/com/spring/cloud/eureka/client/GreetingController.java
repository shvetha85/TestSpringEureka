package com.spring.cloud.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by renuka on 04/04/2017.
 */
public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}