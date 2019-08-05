package ru.geekbarins.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ElectronicGeekMarketEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicGeekMarketEurekaApplication.class, args);
    }
}