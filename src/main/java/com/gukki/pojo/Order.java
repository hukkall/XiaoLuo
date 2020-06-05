package com.gukki.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    //订单
    private int Order_ID;
    private int User_ID;
    private String Phone;
    private String Address;
    private int Category;
    private String Staues;
    private int Constuct_Tpye;
    private Date Reserve_Date;
    private Date Submit_Date;
    private int Result;
    private double Area;
}
