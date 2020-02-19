package com.lefile.usermanager.controller;

import com.lefile.usermanager.entity.User;
import com.lefile.usermanager.service.UserService;
import com.lefile.usermanager.utils.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("添加用户的接口")
    @ApiImplicitParam(name = "username", value = "default", defaultValue = "default")
    public JsonResult addUser(@RequestParam(name = "username") String userName, @RequestParam(name = "password") String passwd) {
        return userService.addUser(new User(userName, passwd, User.DEFAULT_LIMIT));
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("根据用户id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户的id", defaultValue = "99", required = true)
    public JsonResult getUser(@RequestParam(name = "id") Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("根据用户id删除用户")
    @ApiImplicitParam(name = "id", value = "用户的id", defaultValue = "99", required = true)
    public JsonResult deleteUser(@RequestParam(name = "id") Long id) {
        return userService.deleteUserById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("根据用户id修改用户信息")
    @ApiImplicitParam(name = "id", value = "用户的id", defaultValue = "99", required = true)
    public JsonResult updateUser(@RequestParam(name = "id") Long id) {
        return userService.updateUser();
    }


}
