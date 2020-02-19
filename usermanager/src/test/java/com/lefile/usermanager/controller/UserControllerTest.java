package com.lefile.usermanager.controller;

import com.lefile.usermanager.UsermanagerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UsermanagerApplication.class)
public class UserControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;
    private MockHttpSession session;

    @Before
    public void setupMVC() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
//        session = new MockHttpSession();
    }

    @Test
    public void addUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/user/add").param("username", "test1")
                .param("password", "123456").accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + "retStr:" + retStr);
    }

    @Test
    public void deleteUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/user/delete").param("id", "0")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + " retStr:" + retStr);
    }

    @Test
    public void updateUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/user/update").param("id", "0")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + " retStr:" + retStr);
    }

    @Test
    public void getUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/user/get").param("id", "0")
                .accept(MediaType.APPLICATION_JSON)).andReturn();
        int status = result.getResponse().getStatus();
        String retStr = result.getResponse().getContentAsString();
        System.out.println("status:" + status + " retStr:" + retStr);
    }

}
