package com.haijiao12138.demo.leetcode.十月.mapper;

import com.haijiao12138.demo.leetcode.十月.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Repository;

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
