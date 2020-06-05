package com.gukki.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gukki.pojo.User;
import com.gukki.service.impl.UserServiceImpl;
import com.gukki.utils.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/gologin")
    public ModelAndView GoLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");//jump login.jsp
        return modelAndView;
    }
    @RequestMapping("/login")//Login
    public String Login(String username, String password) {
        Res res = userService.IsLoginSuccess(username, password);
        return JSON.toJSONString(res);
    }

    @RequestMapping("/goreg")// go registered page
    public ModelAndView goReg() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");//jump add.jsp
        return modelAndView;
    }

    @RequestMapping("/reg")//request register
    public String Reg(@RequestBody JSONObject user) {
        User user1 = JSON.toJavaObject(user, User.class);
        Res res = userService.Regist(user1);
        System.out.println(res);
        return JSON.toJSONString(res);
    }
}
