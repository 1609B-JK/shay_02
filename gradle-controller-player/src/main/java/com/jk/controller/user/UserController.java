package com.jk.controller.user;

import com.google.gson.Gson;
import com.jk.pojo.user.User;
import com.jk.service.user.UserService;
import com.jk.util.JsonOutUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by apple on 2017/5/23.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectUserList")
    public String selectUser(HttpServletResponse response) {
        List<User> userList = userService.selectUserList();
        String json = new Gson().toJson(userList);
        JsonOutUtil.jsonOut(json,response);
        return "useList";
    }
}
