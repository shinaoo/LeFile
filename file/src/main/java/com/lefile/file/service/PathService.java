package com.lefile.file.service;

import com.alibaba.fastjson.JSON;
import com.lefile.file.entity.json.PanFile;
import com.lefile.file.utils.JsonResult;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class PathService {

    public JsonResult getFiles(String path){
        File file = new File("E:\\",path);
        if (file.exists()){
            if (file.isDirectory()){
                File[] files = file.listFiles();
                List<PanFile> pfs = new ArrayList<>();
                for (File item:files){
                    if (item.isHidden())
                        continue;
                    PanFile pf = new PanFile();
                    pf.setName(item.getName());
                    pf.setFileType(item.isDirectory() ? 0 : 1);
                    pfs.add(pf);
                }
                return JsonResult.ok(JSON.toJSONString(pfs));
            }else{
                return JsonResult.errorMsg("Path isn't a directory.");
            }
        }else{
            return JsonResult.errorMsg("File doesn't exist.");
        }
    }

}
