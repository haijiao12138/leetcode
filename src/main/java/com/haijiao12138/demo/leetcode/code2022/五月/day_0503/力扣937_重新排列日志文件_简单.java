package com.haijiao12138.demo.leetcode.code2022.五月.day_0503;

import java.util.Arrays;

/**
 * @ClassName 力扣937_重新排列日志文件_简单
 * @Author houyuanbo
 * @Date 2022/5/3 11:11
 * @Description TODO
 * @Version
 **/
public class 力扣937_重新排列日志文件_简单 {
    public static void main(String[] args) {
        String[] logs =  {"let1 22 can","dig1 abc 1 5 1"};
        reorderLogFiles(logs);
        System.out.println();

    }

    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(log1,log2) -> {
            String[] split1 = log1.split(" ", 2);//以“ ”未区分 分成两部分
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));//如果第一个是数字 直接返回true
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2 ){
                //都是字符之间的比较  字母日志
                int cmp = split1[1].compareTo(split2[1]);//比较字母的大小 如果split1大  返回1  相等返回0  小于返回-1
                if (cmp == 0){
                    //相等比较标识符
                    return split1[0].compareTo(split2[0]);
                }
                return  cmp;//会根据大小 自动排序的
            }
            //字符和数字的比较
            //isDigit1 为true  代表是数字 看isDigit2的情况
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;//都是数字 的话  就返回0 不做比较 ； 第一个不是数字的话
        });
        return logs;
    }
}
