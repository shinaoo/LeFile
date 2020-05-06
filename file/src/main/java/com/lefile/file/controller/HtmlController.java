package com.lefile.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {

    @RequestMapping("/file")
    public String getFileHtml(){
        return "file.html";
    }
}
