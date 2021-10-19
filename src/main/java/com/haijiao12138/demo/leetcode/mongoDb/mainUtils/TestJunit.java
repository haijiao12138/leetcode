package com.haijiao12138.demo.leetcode.mongoDb.mainUtils;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestJunit
 * @Author houyuanbo
 * @Date 2021/9/29 10:43
 * @Description TODO 开启单元测试
 * @Version
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJunit {
    @Autowired
    StringRedisTemplate redisTemplate;

    @org.junit.Test
    public void getLearn(){
        redisTemplate.opsForValue().set("333","888888",10, TimeUnit.HOURS);
        String s = redisTemplate.opsForValue().get("333");
        System.out.println("我是单元测试，---------------------");
        System.out.println("我是单元测试，---------------------"+s);
    }

    @org.junit.Test
    public void test1(){
        System.out.println("我是单元测试，---------------------");
    }
}
