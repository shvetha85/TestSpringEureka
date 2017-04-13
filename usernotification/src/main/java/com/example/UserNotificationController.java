package com.example;

import dto.UserView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserNotificationController implements InterfaceUserNotificationController {

    @RequestMapping("/notification")
    public String getUser(@RequestParam(value = "id", defaultValue = "1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserView user = restTemplate.getForObject("http://localhost:5000/user?id="+id, UserView.class);
        String response = "NOTIFICATIONS"+user.getNotifications();
        return response;
    }
    @RequestMapping("/message")
    public String getMessage() {
       String response = "Hello Message from notification";
        return response;
    }
}
