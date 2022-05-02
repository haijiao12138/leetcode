package com.haijiao12138.demo.leetcode.code2021.十月.controller;

import com.github.pagehelper.PageInfo;
import com.haijiao12138.demo.leetcode.code2021.util.ResultJson;
import com.haijiao12138.demo.leetcode.code2021.十月.entity.User;
import com.haijiao12138.demo.leetcode.code2021.十月.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName UserController
 * @Author houyuanbo
 * @Date 2021/10/14 17:58
 * @Description TODO
 * @Version
 **/
@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }


    //测试分页1
    @GetMapping("getUserByPage")
    public PageInfo<User> GetUserByPage(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                              @RequestParam(value = "pageSize", defaultValue = "5") int pageSize){
        PageInfo<User> queryResult = userService.findAllUserByPage(currentPage, pageSize);
        return queryResult;
    }

    //测试分页2
    @GetMapping("getUserByPage2")
    public List<User> GetUserByPage2(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                                        @RequestParam(value = "pageSize", defaultValue = "5") int pageSize){
        List<User> queryResult = userService.findAllUserByPage2(currentPage, pageSize);
        return queryResult;
    }

    //使用定义的json格式传参
    //测试分页2
    @GetMapping("getUserByPage3")
    public ResultJson GetUserByPage3(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                                     @RequestParam(value = "pageSize", defaultValue = "5") int pageSize){
        List<User> queryResult = userService.findAllUserByPage2(currentPage, pageSize);
        return ResultJson.ok(queryResult);
        // return ResultJson.failure(NOT_FOUNDDATA);
    }

    //使用定义的json格式传参
    //测试分页1
    @GetMapping("getUserByPage4")
    public ResultJson GetUserByPage4(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
                                        @RequestParam(value = "pageSize", defaultValue = "5") int pageSize){
        PageInfo<User> queryResult = userService.findAllUserByPage(currentPage, pageSize);
        return ResultJson.ok(queryResult) ;
    }

}
