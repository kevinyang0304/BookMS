package com.org.website.server.service;

import com.org.website.server.entity.User;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2019-07-24 22:29:41
 */
public interface UserService {

    List<User> getUser(User user);
}