package com.informatics.cscb869f2019week8server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cscb869f2019week8serverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cscb869f2019week8serverApplication.class, args);
    }

}
