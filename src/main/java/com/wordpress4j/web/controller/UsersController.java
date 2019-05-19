package com.wordpress4j.web.controller;

import com.wordpress4j.entity.Users;
import com.wordpress4j.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/wp-admin")
public class UsersController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/users")
    public String users() {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        ids.add(4L);
        List<Users> byId = userService.findByIds(ids);
        log.info("用户基本信息为：" + byId.toString());
        return "欢迎来到用户中心";
    }

    @ResponseBody
    @RequestMapping("/userNew")
    public String userNew() {
        return "欢迎来到用户中心";
    }

    @ResponseBody
    @RequestMapping("/profile")
    public String profile() {

        Users byId = userService.findById(1L);
        log.info("用户基本信息为：" + byId.toString());
        return "欢迎来到用户中心";
    }


}
