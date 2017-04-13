package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by renuka on 04/04/2017.
 */
public interface InterfaceUserNotificationController {
    @RequestMapping("/notification")
    String getUser(@RequestParam(value = "id", defaultValue = "1") int id);

    @RequestMapping("/message")
    public String getMessage() ;
}
