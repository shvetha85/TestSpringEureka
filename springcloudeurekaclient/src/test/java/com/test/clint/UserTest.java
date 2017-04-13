package com.test.clint;

import com.spring.cloud.eureka.client.UserController;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by renuka on 05/04/2017.
 */
public class UserTest {

    UserController userController=new UserController();

    @Test
    public void sayHello() {
        String str=null;
        str=userController.sayHello();
        Assert.assertNotNull(str);
        Assert.assertEquals(str,"Its a hello");
    }
}
