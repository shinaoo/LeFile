package com.lefile.file.controller;

import com.lefile.file.service.FileService;
import com.lefile.file.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("/upload")
    @ResponseBody
    public JsonResult upload(@RequestParam("uploadFile") MultipartFile file, HttpServletRequest request) throws Exception {
        String userName = request.getParameter("userName");
        String projectName = request.getParameter("projectName");
        return fileService.addFile(userName, projectName, file);
        //文件名
//        String fileName = file.getOriginalFilename();
//        System.out.println("文件名:" + fileName);
        //文件后缀
//        String suffixName = fileName.substring(fileName.lastIndexOf("."));
//        System.out.println("文件后缀名" + suffixName);
        //创建文件
//        try {
//            File localFile = new File("D:\\apache", fileName);
//            file.transferTo(localFile);
//            return "success:" + localFile.getAbsolutePath();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "failed upload file";
    }

    @RequestMapping(value = "/download",method = RequestMethod.GET)
    public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String fileName = request.getParameter("fileName");
        String projectName = request.getParameter("projectName");
        String userName = request.getParameter("userName");
//        File file = new File(String.format("D:\\%s\\%s\\%s", userName, projectName, fileName));
        File file = new File("D:\\apache\\USBWriter.exe");
        if (file.exists()) {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                response.setContentType("application/force-download");
                response.addHeader("Content-disposition", "attachment;fileName=" + file.getName());
                OutputStream os = response.getOutputStream();
                byte[] buf = new byte[1024];
                int len = 0;
                while ((len = fis.read(buf)) != -1) {
                    os.write(buf, 0, len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fis.close();
            }
        } else {
            System.out.println("file doesn't exist:" + file.getAbsolutePath());
        }
    }


}
