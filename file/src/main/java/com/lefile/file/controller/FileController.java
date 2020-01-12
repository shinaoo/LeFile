package com.lefile.file.controller;

import com.lefile.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping
    @ResponseBody
    public String upload(MultipartFile file){
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String filepath="";

        return "success";
    }

    @GetMapping("/{id}")
    public void download(HttpServletRequest request, HttpServletResponse response)throws Exception{
        File file = new File("");
        FileInputStream fis = new FileInputStream(file);
        response.setContentType("application/force-download");
        response.addHeader("Content-disposition", "attachment;fileName=" + "a.txt");
        OutputStream os = response.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf)) != -1){
            os.write(buf,0,len);
        }
        fis.close();
    }

    @DeleteMapping("/{id}")
    public String deleteFile(){
        return "successs";
    }



}
