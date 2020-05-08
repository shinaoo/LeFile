package com.lefile.file.service;

import com.lefile.file.utils.JsonResult;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public JsonResult login(String name,String password,String token){
        if ("1".equals(name) && "1".equals(password) && "1".equals(token)){
            return JsonResult.ok();
        }else{
            return JsonResult.errorMsg("Login failed");
        }
    }
}
