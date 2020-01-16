package com.lefile.file;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.io.FileInputStream;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FileApplication.class)
public class FileTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setup(){
        System.out.println("setup run");
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void fileUploadTest() throws Exception{
        MockMultipartFile mockMultipartFile = new MockMultipartFile("file","test.txt","multipart/form-data",new FileInputStream(new File("D:\\test.txt")));
        String file = mvc.perform(MockMvcRequestBuilders.fileUpload("/file")
                .file(mockMultipartFile))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(file);
    }

}
