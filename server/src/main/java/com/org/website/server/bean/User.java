package com.org.website.server.bean;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
}
