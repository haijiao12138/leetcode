package com.haijiao12138.demo.leetcode.code2021.mongoDb.controller;


import com.haijiao12138.demo.leetcode.code2021.mongoDb.entity.MongoTest;
import com.haijiao12138.demo.leetcode.code2021.mongoDb.service.MongoTestService;
import com.haijiao12138.demo.leetcode.code2021.mongoDb.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.haijiao12138.demo.leetcode.code2021.mongoDb.util.ResultCode.*;


/**
 * Create 新增
 * - post
 * - options 常见于跨域场景，post之前要options一次请求头(不带请求体数据，太多了)，称为预检测preflight
 * <p>
 * Delete 删除
 * <p>
 * delete
 * Update 更新
 * <p>
 * put 全字段覆盖
 * patch 打补丁/只更新部分字段
 * Retrieve 查询
 * <p>
 * get
 * head 相较于get，只返回响应头(不返回响应体数据)，一般用于测试数据的存在性。
 **/
@Slf4j
@Validated
@RestController
@RequestMapping("Mongo")
public class MongoTestController {

    //    @Value("${dependency.scanner.path}")
//    private String dependencyScannerPath;//基于注解读取配置文件中的信息
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Autowired
    private MongoTestService mongoTestService;

    //插入
    @PostMapping(value = "/test1")
    public ResultJson saveTest(@RequestBody MongoTest mongoTest) {
        List<MongoTest> list = new ArrayList<MongoTest>();
        MongoTest mgtest = new MongoTest();
        if (mongoTest.getIds() != null) {
            mgtest.setIds(mongoTest.getIds());
        }
        if (mongoTest.getAge() != null) {
            mgtest.setAge(mongoTest.getAge());
        }
        if (!mongoTest.getName().isEmpty()) {
            mgtest.setName(mongoTest.getName());

        }
        MongoTest mongoTest1 = mongoTestService.saveTest(mgtest);

        if (mongoTest1 != null) {
            return ResultJson.ok();
        }
        return ResultJson.failure(SERVER_FAILURE);


    }

    //查询
    @GetMapping("/test2/{currentPage}/{pageSize}")
    @ResponseBody
    public ResultJson findTestByName(@PathVariable Integer currentPage, @PathVariable Integer pageSize, @RequestBody MongoTest mongoTest) {

        List<MongoTest> list = mongoTestService.findTestByName(currentPage, pageSize, mongoTest);

        if (list.size() > 0) {
            return ResultJson.ok(list);
        }

        return ResultJson.failure(NOT_FOUNDDATA);
    }

    //更新
    @PutMapping(value = "/test3")
    public ResultJson updateTest(@RequestBody MongoTest mongoTest) {
        long l = mongoTestService.updateTest(mongoTest);
        if (l != 0 && l > 0) {
            return ResultJson.ok("更新数据成功");
        }
        return ResultJson.failure(UPDATE_FAILURE);
    }


    //删除
    @DeleteMapping("/test4")
    public ResultJson deleteTestById(int ids) {
        long l = mongoTestService.deleteTestById(ids);
        if (l > 0) {
            return ResultJson.ok();
        }
        return ResultJson.failure(DELETE_FAILURE);
    }
}
