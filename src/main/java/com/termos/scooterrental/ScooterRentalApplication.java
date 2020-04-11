package com.termos.scooterrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:message.properties")
@ComponentScan(basePackages = {
        "com.termos.scooterrental.controller",
        "com.termos.scooterrental.common",
        "com.termos.scooterrental.repository",
        "com.termos.scooterrental.model"
}
)
public class ScooterRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScooterRentalApplication.class, args);
    }

}
