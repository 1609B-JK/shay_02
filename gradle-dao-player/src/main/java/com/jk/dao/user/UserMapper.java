package com.jk.dao.user;

import com.jk.pojo.user.User;

import java.util.List;

/**
 * Created by apple on 2017/5/23.
 */
public interface UserMapper {
    List<User> selectUserList();
}
