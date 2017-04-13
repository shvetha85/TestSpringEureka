package com.test.notif;

import com.example.UserNotificationController;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by renuka on 05/04/2017.
 */
public class NotificationControllerTest {


    UserNotificationController userController=new UserNotificationController();

    @Test
    public void validMessage() {
        Logger.getGlobal().info("Start validMessage test");
        String str=null;
        str=userController.getMessage();
        Assert.assertNotNull(str);
        Assert.assertEquals(str,"Hello Message from notification");
        Logger.getGlobal().info("End validMessage test");
    }
}
