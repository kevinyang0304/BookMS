package com.org.website.server.controller;

import com.org.website.server.entity.User;
import com.org.website.server.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-07-24 22:29:41
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @PostMapping("getUser")
    List<User> getUser(@RequestBody User user){
        List<User> res = userService.getUser(user);

        return res;
    }

}