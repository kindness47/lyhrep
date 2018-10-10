package com.hx.controller;

import com.hx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public void addUser(){
        System.out.println("你来了");
        userService.addUser("李四");

    }

}
