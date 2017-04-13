package com.spring.cloud.feign.client;

/**
 * Created by renuka on 04/04/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@Controller
public class FeignClientApplication {
    @Autowired
    private GreetingClient greetingClient;

    @Autowired
    private NotificationClient notificationClient;

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting-view";
    }

    @RequestMapping("/message")
    public String greetingMessage(Model model) {
        model.addAttribute("greeting", notificationClient.getMessage());
        return "greeting-view";
    }
}
