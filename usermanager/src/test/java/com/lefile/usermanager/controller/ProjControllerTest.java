package com.lefile.usermanager.controller;

import com.lefile.usermanager.UsermanagerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UsermanagerApplication.class)
public class ProjControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setup() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void addProj() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/proj/add").param("projname", "test1")
                .param("userId", "123456").accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + "retStr:" + retStr);
    }

    @Test
    public void deleteProj() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/proj/delete")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + "retStr:" + retStr);
    }

    @Test
    public void updateProj() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/proj/update")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + "retStr:" + retStr);
    }

    @Test
    public void getProj() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/proj/update")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + "retStr:" + retStr);
    }

}
