package com.chariot.totoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Trung Vu on 2018/03/28.
 */
@SpringBootApplication
@EnableEurekaServer
public class TotoroServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TotoroServiceDiscoveryApplication.class, args);
    }
}
