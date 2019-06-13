package com.org.website.server.controller;

import com.org.website.server.bean.Book;
import com.org.website.server.service.LoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static java.lang.System.out;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:8082",allowCredentials = "true")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password) {
        out.println("username: " + username + " password: " + password);
        if (loginService.isAuthorized(username, password)) {
            out.println("logining");
            return "home";
        }
        System.out.println("wrong pwd");
        return "login";
    }

}
