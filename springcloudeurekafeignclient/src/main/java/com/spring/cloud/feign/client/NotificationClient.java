package com.spring.cloud.feign.client;

import com.example.InterfaceUserNotificationController;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by renuka on 04/04/2017.
 */
@FeignClient("user-notification")
public interface NotificationClient extends InterfaceUserNotificationController{
}
