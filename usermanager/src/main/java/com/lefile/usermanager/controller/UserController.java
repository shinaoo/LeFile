package com.lefile.usermanager.controller;

import com.lefile.usermanager.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  /user               ->post 添加
 *  /user/{id}          ->get 获取user信息
 *  /user/{id}          ->delete 删除用户信息
 *  /user/{id}          ->put   更新用户信息
 */
@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @ApiOperation("添加用户的接口")
    @ApiImplicitParam(name = "username",value = "default",defaultValue = "default")
    public boolean addUser(@PathVariable(name = "username")String userName,@PathVariable(name = "password")String passwd){

        return true;
    }

    @GetMapping
    @ApiOperation("根据用户id查询用户的接口")
    @ApiImplicitParam(name = "id",value = "用户的id",defaultValue = "99",required = true)
    public String getUser(@PathVariable Long id){
        return "haha";
    }

    @DeleteMapping
    @ApiOperation("根据用户id删除用户")
    @ApiImplicitParam(name = "id",value = "用户的id",defaultValue = "99",required = true)
    public boolean deleteUser(@PathVariable Long id){
        return true;
    }

    @PutMapping
    @ApiOperation("根据用户id修改用户信息")
    @ApiImplicitParam(name = "id",value = "用户的id",defaultValue = "99",required = true)
    public boolean updateUser(@PathVariable Long id){
        return true;
    }


}
