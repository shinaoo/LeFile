package com.lefile.file.controller;

import com.lefile.file.service.ClientService;
import com.lefile.file.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult login(@RequestParam("cName")String cName,@RequestParam("cPass")String cPass,@RequestParam("cToken")String token){
        return clientService.login(cName,cPass,token);
    }

}
