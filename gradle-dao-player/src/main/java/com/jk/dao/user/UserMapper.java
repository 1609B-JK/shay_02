package com.jk.dao.user;

import com.jk.pojo.user.UserRequest;
import com.jk.pojo.user.UserResponse;

import java.util.List;

/**
 * Created by apple on 2017/5/23.
 */
public interface UserMapper {

    UserResponse login(UserRequest userRequest);

    void insertUser(UserRequest userRequest);

}
