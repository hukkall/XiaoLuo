package com.gukki.service;

import com.gukki.pojo.User;
import com.gukki.utils.Res;
import org.springframework.stereotype.Service;

public interface UserService {
    public Res IsLoginSuccess(String name, String password);

    public Res Regist(User user);
}
