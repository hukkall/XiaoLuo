package com.gukki.service.impl;

import com.gukki.dao.OrderMapper;
import com.gukki.pojo.Order;
import com.gukki.service.OrderService;
import com.gukki.utils.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper mapper;
    @Override
    public Res QueryAll() {
        List<Order> orders = mapper.QueryAll();
        if (orders!=null){
            return Res.ActionSucces("Success",orders);
        }
        return Res.ActionError("Null");
    }
}
