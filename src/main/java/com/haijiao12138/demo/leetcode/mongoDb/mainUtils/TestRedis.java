package com.haijiao12138.demo.leetcode.mongoDb.mainUtils;

import com.alibaba.fastjson.JSON;
import com.haijiao12138.demo.leetcode.mongoDb.entity.MongoTest;
import com.haijiao12138.demo.leetcode.mongoDb.entity.User;
import com.haijiao12138.demo.leetcode.mongoDb.service.MongoTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName TestRedis
 * @Author houyuanbo
 * @Date 2021/9/29 14:34
 * @Description TODO
 * @Version
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private MongoTestService mongoTestService;

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public  void test1(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        redisTemplate.opsForValue().set("json", user);
        System.out.println("插入成功！==============================");
        Object uu = redisTemplate.opsForValue().get("json");
        User user1 = JSON.toJavaObject((JSON) uu, User.class);
        System.out.println(user1);
    }

    @Test
    public void test2(){
        MongoTest mongoTest = new MongoTest();
        mongoTest.setName("111测试");
        List<MongoTest> list = mongoTestService.findTestByName(1, 5, mongoTest);
        redisTemplate.opsForValue().set("list", list);//存入数据
        Object uu = redisTemplate.opsForValue().get("list");
        System.out.println(uu);
    }



}
