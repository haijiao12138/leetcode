package com.haijiao12138.demo.leetcode.code2021.八月.test0831;

import java.util.StringTokenizer;

/**
 * @author: haijiao12138
 * @ClassName: 切割字符串长度
 * @description: TODO
 * @date: 2021/8/31 15:44
 */
public class 切割字符串长度 {
    public static void main(String[] args) {

        String str = "I love you Lucy, you you you You are my first!";
        int count = 0;

        StringTokenizer st = new StringTokenizer(str, ", !");// 按逗号/空格/叹号分割,其他字符自行添加

        while (st.hasMoreElements()) {
            if (st.nextElement().equals("you")){
                count++;
            }
            //System.out.println(count);
            //System.out.println(st.nextElement());
        }
        System.out.println(count);
    }
}
