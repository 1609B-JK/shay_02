package com.jk.controller.user;

import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 2017/5/23.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
}
