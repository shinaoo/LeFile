package com.lefile.file.controller;

import com.lefile.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("filefile") MultipartFile file, HttpServletRequest request) throws Exception {
        String name = request.getParameter("name");
        //文件名
        String fileName = file.getOriginalFilename();
        System.out.println("文件名:" + fileName);
        //文件后缀
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        System.out.println("文件后缀名" + suffixName);
        //创建文件
        try {
            File localFile = new File("D:\\apache", fileName);
            file.transferTo(localFile);
            return "success:" + localFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed upload file";
    }

    @GetMapping("/{id}")
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
        File file = new File("");
        FileInputStream fis = new FileInputStream(file);
        response.setContentType("application/force-download");
        response.addHeader("Content-disposition", "attachment;fileName=" + "a.txt");
        OutputStream os = response.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            os.write(buf, 0, len);
        }
        fis.close();
    }


}
