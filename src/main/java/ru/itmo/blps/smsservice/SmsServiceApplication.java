package ru.itmo.blps.smsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SmsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsServiceApplication.class, args);
    }

}
