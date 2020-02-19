package com.lefile.usermanager.controller;

import com.lefile.usermanager.service.ProjService;
import com.lefile.usermanager.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/proj")
public class ProjController {

    @Autowired
    private ProjService projService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addProje(@RequestParam(name = "projname") String projName, @RequestParam(name = "userId") long userId) {
        return projService.addProj();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult delProj(){
        return projService.deleteProj();
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult updateProj(){
        return projService.updateProj();
    }

    @RequestMapping(value = "/get",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getProj(){
        return projService.getProj();
    }

}
