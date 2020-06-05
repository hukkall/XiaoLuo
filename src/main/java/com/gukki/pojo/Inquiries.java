package com.gukki.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inquiries {
    //疑问咨询
    private int Inquiry_ID;//咨询ID
    private int User_ID;//用户ID
    private String Content;//咨询内容
    private Date Inquiry_Date;//咨询日期
    private Date Reply_Date;//回复日期
}
