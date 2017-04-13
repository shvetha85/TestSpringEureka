package com.spring.cloud.feign.client; /**
 * Created by renuka on 04/04/2017.
 */

import com.spring.cloud.eureka.client.GreetingController;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}