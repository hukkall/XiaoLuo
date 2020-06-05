package com.gukki.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //用户
    private int User_ID;
    private String Name;
    private String Password;
    private String Nickname;
    private String Avatar;
    private String Phone;
    private int Role;
}
