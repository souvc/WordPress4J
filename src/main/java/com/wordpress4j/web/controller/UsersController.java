package com.wordpress4j.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wp-admin")
public class UsersController {


    @ResponseBody
    @RequestMapping("/users")
    public String users() {
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
        return "欢迎来到用户中心";
    }


}
