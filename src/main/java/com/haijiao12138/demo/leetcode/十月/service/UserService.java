package com.haijiao12138.demo.leetcode.十月.service;

import com.haijiao12138.demo.leetcode.十月.entity.User;
import com.haijiao12138.demo.leetcode.十月.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * @ClassName UserService
 * @Author houyuanbo
 * @Date 2021/10/14 18:05
 * @Description TODO
 * @Version
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
