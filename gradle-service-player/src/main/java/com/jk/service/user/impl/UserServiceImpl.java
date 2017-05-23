package com.jk.service.user.impl;

import com.jk.dao.user.UserMapper;
import com.jk.pojo.user.User;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by apple on 2017/5/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}
