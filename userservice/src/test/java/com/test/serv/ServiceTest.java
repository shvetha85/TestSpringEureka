package com.test.serv;

import com.example.UserController;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by renuka on 05/04/2017.
 */
public class ServiceTest {


        UserController userController=new UserController();

        @Test
        public void validMessage() {
            Logger.getGlobal().info("Start validMessage test");
           String str=null;
            str=userController.sayHello();
            Assert.assertNotNull(str);
            Assert.assertEquals(str,"Its a hello");
            Logger.getGlobal().info("End validMessage test");
            Logger.getGlobal().info("Start test");
        }

}
