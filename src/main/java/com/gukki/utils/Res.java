package com.gukki.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Res implements Serializable {
    private int status;
    private String msg;
    private Object data;

    public Res(int status) {
        this.status = status;
    }

    public Res(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Res(String msg) {
        this.msg = msg;
    }

    public static Res ActionSucces(String msg, Object object){
        return new Res(1,msg,object);
    }
    public static Res ActionError(String msg){
        return new Res(0,msg);
    }
    public static Res ActionSucces(String msg){
        return new Res(1,msg);
    }
    public static Res ActionSucces(){
        return new Res(1);
    }
}
