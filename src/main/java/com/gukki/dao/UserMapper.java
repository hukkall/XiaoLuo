package com.gukki.dao;

import com.gukki.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;

import java.util.List;

public interface UserMapper {
    //Query All Users
    List<User> QueryAll();

    //Query A User By ID
    User QueryByID(int id);

    //Update A User
    int Update(User user);

    //Delete A User
    int DeleteUserByID(int id);

    //Add A User
    int AddUser(User user);

    //Check Login
    User CheckLogin(@Param("Name") String Name, @Nullable @Param("Password") String Password);
    //Check Login Name
    //User CheckLoginName(String Name);
}
