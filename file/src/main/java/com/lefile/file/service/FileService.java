package com.lefile.file.service;

import com.lefile.file.utils.JsonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileService {

    public JsonResult addFile(String userName, String projectName, MultipartFile file) {
        try {
            File file_local = new File("D:\\apache", file.getOriginalFilename());
            file.transferTo(file_local);
            return JsonResult.ok("path:" + file_local.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JsonResult.errorMsg("file upload failed");
    }

    public boolean addFile() {
        return true;
    }

    public boolean deleteFile(String path) {
        return true;
    }

    public boolean getFile(String path) {
        return true;
    }


}
