package com.gukki.dao;

import com.gukki.pojo.Order;
import com.gukki.utils.Res;

import java.util.List;

public interface OrederMapper {
    //Delete An Order By Order_ID
    int DeleteOrderByID(int id);
    //Add An Order
    int AddOrder(Order order);
    //Query An Order By Order_ID
    Order QueryOrder(int id);
    //Query An Order By User_ID
    Order QueryOrderByUser(int id);
    //Query All Order By User_ID
    List<Order> QueryAll(int id);
    //Query All Order
    List<Order> QueryAll();
    //Query The Result Of Order
    int QueryResult(int id);
}
