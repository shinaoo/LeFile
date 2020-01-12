package com.lefile.usermanager.service;

import com.lefile.usermanager.dao.mysql.UserDao;
import com.lefile.usermanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    private boolean addUser(User user){
        
        return true;
    }

}
