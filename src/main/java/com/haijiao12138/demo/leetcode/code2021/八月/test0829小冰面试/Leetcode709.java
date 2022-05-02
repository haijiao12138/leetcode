package com.haijiao12138.demo.leetcode.code2021.八月.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: Leetcode709
 * @description: TODO
 * @date: 2021/8/30 20:53
 */
public class Leetcode709 {
    public static void main(String[] args) {
        String hello = toLowerCase("Hello");
        System.out.println(hello);
    }
    public static String toLowerCase(String str){
        if (str == null && "".equals(str)){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c>='A' && c<='Z'){
                sb.append((char)(c+32));//大写变小写字母
            }else {
                sb.append(c);
            }
        }
        return String.valueOf(sb);
    }
}
