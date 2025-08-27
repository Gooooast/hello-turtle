package com.example.api.domain;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private Integer age;
    private String hometown;
}
