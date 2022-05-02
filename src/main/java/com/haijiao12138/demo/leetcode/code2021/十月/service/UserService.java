package com.haijiao12138.demo.leetcode.code2021.十月.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haijiao12138.demo.leetcode.code2021.十月.entity.User;
import com.haijiao12138.demo.leetcode.code2021.十月.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public PageInfo<User> findAllUserByPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<User> lists = userMapper.queryUserInfo();
        PageInfo<User> pageInfo = new PageInfo<User>(lists);
        return pageInfo;
    }

    public List<User> findAllUserByPage2(int currentPage, int pageSize) {
        //PageHelper.startPage(currentPage, pageSize);
        List<User> lists = userMapper.queryUserInfo();
        return lists;
    }
}
