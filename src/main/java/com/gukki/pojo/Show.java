package com.gukki.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {
    //晒单
    private int Show_ID;
    private int User_ID;
    private Date Show_Time;
    private boolean IsAnonymous;
    private String Pic_Url;
}
