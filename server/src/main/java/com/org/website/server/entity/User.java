package com.org.website.server.entity;

import java.io.Serializable;
import lombok.Data;
/**
 * (User)实体类
 *
 * @author makejava
 * @since 2019-07-24 22:31:06
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 881321600215155310L;
    //主键ID
    private Long id;
    //用户名
    private String username;
    //密码
    private String password;
    //邮箱
    private String email;


}