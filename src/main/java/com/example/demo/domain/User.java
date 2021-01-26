package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;

@Data

public class User {
    private Integer id;
    private String name;
    private String password;
    private String perms;
}
