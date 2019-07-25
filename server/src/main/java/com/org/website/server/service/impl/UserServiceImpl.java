package com.org.website.server.service.impl;

import com.org.website.server.dao.UserDao;
import com.org.website.server.entity.User;
import com.org.website.server.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2019-07-24 22:29:41
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUser(User user) {
        return userDao.selectUser(user);
    }
}