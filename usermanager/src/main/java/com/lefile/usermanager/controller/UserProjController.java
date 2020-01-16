package com.lefile.usermanager.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userproj")
public class UserProjController {

    @PostMapping
    public String addProje(@PathVariable(name = "projname") String projName) {
        return "";
    }

}
