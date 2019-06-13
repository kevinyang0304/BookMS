package com.org.website.server.service.impl;

import com.org.website.server.bean.Book;
import com.org.website.server.bean.User;
import com.org.website.server.mapper.BookMapper;
import com.org.website.server.mapper.UserMapper;
import com.org.website.server.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean isAuthorized(String username, String password) {
        List<User> userList = userMapper.selectList(null);
        for(User u : userList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
