package com.jk.service.user.impl;

import com.jk.dao.user.UserMapper;
import com.jk.pojo.user.UserRequest;
import com.jk.pojo.user.UserResponse;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 2017/5/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> login(UserRequest userRequest) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("flag","0");
        map.put("userInfo",null);
        UserResponse userResponse = userMapper.login(userRequest);
        if(null != userResponse) {
            if(userResponse.getUserPwd().equals(userRequest.getUserPwd())) {
                //��¼�ɹ�
                map.put("flag","2");
                map.put("userInfo",userResponse);
            }else{
                //�������
                map.put("flag","1");
            }
        }
        return map;
    }

    @Override
    public UserResponse selectUserByUserAccount(UserRequest userRequest) {
        return userMapper.login(userRequest);
    }

    @Override
    public int regedit(UserRequest userRequest) {
        int flag = 0;
        //���ж��û��Ƿ��ظ�
        UserResponse userResponse = userMapper.login(userRequest);
        if (null == userResponse) {
            flag = 1;
            //ע���û�
            userMapper.insertUser(userRequest);
        }
        return flag;
    }
}
