package com.haijiao12138.demo.leetcode.code2021.mongoDb.service;

import com.haijiao12138.demo.leetcode.code2021.mongoDb.entity.MongoTest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MongoTestService {


    /**
     * 创建对象
     * @param mgtest
     */
    public MongoTest saveTest(MongoTest mgtest);


   public List<MongoTest>  findTestByName(Integer currentPage, Integer pageSize, MongoTest mgtest);

    /**
     * @Author houyuanbo
     * @Description //TODO 更新对象
     * @Date 13:52 2021/9/26
     * @Param [mgTest]
     * @return void
     **/
    public long updateTest(MongoTest mgTest);

    public long deleteTestById(int id);
}
