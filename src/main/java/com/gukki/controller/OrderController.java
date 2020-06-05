package com.gukki.controller;

import com.alibaba.fastjson.JSON;
import com.gukki.service.impl.OrderServiceImpl;
import com.gukki.utils.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;
    @RequestMapping("/query")
    public String query(){
        Res res = orderService.QueryAll();
        return JSON.toJSONString(res);
    }
}
