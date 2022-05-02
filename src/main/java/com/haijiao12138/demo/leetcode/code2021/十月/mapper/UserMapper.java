package com.haijiao12138.demo.leetcode.code2021.十月.mapper;

import com.haijiao12138.demo.leetcode.code2021.十月.entity.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author houyuanbo
 * @Date 2021/10/14 18:01
 * @Description TODO
 * @Version
 **/

public interface  UserMapper {

    User Sel( int id);

    List<User> queryUserInfo();
}
