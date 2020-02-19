package com.lefile.usermanager.service;

import com.lefile.usermanager.entity.Project;
import com.lefile.usermanager.utils.JsonResult;
import org.springframework.stereotype.Service;

@Service("projService")
public class ProjService {

    public JsonResult addProj(){
        return JsonResult.ok();
    }

    public JsonResult deleteProj(){
        return JsonResult.ok();
    }

    public JsonResult updateProj(){
        return JsonResult.ok();
    }

    public JsonResult getProj(){
        return JsonResult.ok(new Project());
    }

}
