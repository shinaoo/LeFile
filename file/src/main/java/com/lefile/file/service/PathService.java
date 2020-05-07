package com.lefile.file.service;

import com.lefile.file.utils.JsonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PathService {

    @Value("{path.root}")
    private String path_root;


    public JsonResult getPath(String path){
        System.out.println("path_root:" + path_root);
        return JsonResult.ok();
    }

}
