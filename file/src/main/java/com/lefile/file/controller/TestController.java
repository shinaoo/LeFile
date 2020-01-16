package com.lefile.file.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/")
    @ResponseBody
    public String getTestStr(@PathVariable(value = "id")String id){
        System.out.println("TestController id:" + id);
        return id;
    }

}
