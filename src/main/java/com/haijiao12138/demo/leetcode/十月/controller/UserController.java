package com.haijiao12138.demo.leetcode.十月.controller;

/**
 * @ClassName UserController
 * @Author houyuanbo
 * @Date 2021/10/14 17:58
 * @Description TODO
 * @Version
 **/
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

}
