package com.gukki.service;

import com.gukki.dao.UserMapper;
import com.gukki.pojo.User;
import com.gukki.utils.Res;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Override
    public Res IsLoginSuccess(String name, String password) {
        User user;
        if((user=mapper.CheckLogin(name,""))==null){//check username
            return Res.ActionError("Username Error");//Username error
        }
        if ((user=mapper.CheckLogin(name,password))!=null){//check password
            return Res.ActionSucces("Success",user);//success
        }
        return Res.ActionError("Password Error");//Password error
    }

    @Override
    @Transactional
    public Res Regist(User user) {
        User user1;
        if((user1=mapper.CheckLogin(user.getName(),""))==null){//check username is occupide?
            mapper.AddUser(user);
            return Res.ActionSucces("Create Success");
        }
        return Res.ActionError("Occupied Username");
    }
}
