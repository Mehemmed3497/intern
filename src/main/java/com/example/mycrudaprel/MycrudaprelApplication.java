package com.example.mycrudaprel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MycrudaprelApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycrudaprelApplication.class, args);
    }

}
