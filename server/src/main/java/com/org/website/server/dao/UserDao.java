package com.org.website.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.org.website.server.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-24 22:29:41
 */
public interface UserDao extends BaseMapper<User> {

    List<User> selectUser(@Param("user") User user);

}