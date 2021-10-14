package com.haijiao12138.demo.leetcode.十月.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName User
 * @Author houyuanbo
 * @Date 2021/10/14 17:57
 * @Description TODO
 * @Version
 **/
@Data
@Builder
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

}
