package com.gukki.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gukki.pojo.User;
import com.gukki.service.UserServiceImpl;
import com.gukki.utils.Res;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/t1")
    public String Login(String username, String password) {
        Res res = userService.IsLoginSuccess(username, password);
        System.out.println(res);
        System.out.println(username + ":" + password);
        String s = JSON.toJSONString(res);
        System.out.println(s);
        return s;
    }

    @RequestMapping("/goreg")
    public ModelAndView goReg() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return modelAndView;
    }

    @RequestMapping("/reg")
    public String Reg(@RequestBody JSONObject user) {
        User user1 = JSON.toJavaObject(user, User.class);
        userService.Regist(user1);
        return JSON.toJSONString(Res.ActionSucces("Reg Success"));
    }
}
