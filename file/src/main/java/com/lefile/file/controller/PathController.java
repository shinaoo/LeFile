package com.lefile.file.controller;

import com.lefile.file.service.PathService;
import com.lefile.file.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/path")
public class PathController {

    @Autowired
    PathService pathService;

    @RequestMapping("/getFiles")
    @ResponseBody
    public JsonResult getPath(@RequestParam("path")String path){
        return pathService.getFiles(path);
    }
}
