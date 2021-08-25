package com.haijiao12138.demo.leetcode.test0822;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.Arrays;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: ListToJson
 * @description: TODO
 * @date: 2021/8/22 21:32
 */
public class ListToJson {
    @Autowired
    StringRedisTemplate stringRedisTemplate;


    public static   void main(String[] args) {
        JSONObject object = new JSONObject();
        //string
        object.put("string","string");
        //int
        object.put("int",2);
        //boolean
        object.put("boolean",true);
        //array
        List<Integer> integers = Arrays.asList(1,2,3);
        object.put("list",integers);
        //null
        object.put("null",null);
        System.out.println(object);
        Jedis jedis = new Jedis();
        Long rpush = jedis.rpush("001", String.valueOf(object));
        jedis.set("003", String.valueOf(object));
        jedis.rpush("002", String.valueOf(object));
        String rpop = jedis.rpop("001");
        String rpop1 = jedis.rpop("002");
        String rpop2 = jedis.get("003");
        System.out.println(rpop);
        System.out.println(rpop1);
        System.out.println(rpop2);
    }
}
