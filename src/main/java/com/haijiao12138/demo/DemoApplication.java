package com.haijiao12138.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@MapperScan("com.haijiao12138.demo.leetcode.code2021.十月.mapper") //扫描的mapper
@SpringBootApplication
//@EnableScheduling//定时任务启动
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
