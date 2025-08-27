package com.example;

import com.burukeyou.uniapi.annotation.UniAPIScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@UniAPIScan( "com.example.api")
@SpringBootApplication
public class HelloApplicaion {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplicaion.class);
    }
}
