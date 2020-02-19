package com.lefile.usermanager.service;

import com.lefile.usermanager.dao.mysql.UserDao;
import com.lefile.usermanager.entity.User;
import com.lefile.usermanager.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public JsonResult addUser(User user){
        return JsonResult.ok();
    }

    public JsonResult getUserById(long id){
        return JsonResult.ok();
    }

    public JsonResult deleteUserById(long id){
        return JsonResult.ok();
    }

    public JsonResult deleteUserByName(String username){
        return JsonResult.ok();
    }

    public JsonResult updateUser(){
        return JsonResult.ok();
    }



}
