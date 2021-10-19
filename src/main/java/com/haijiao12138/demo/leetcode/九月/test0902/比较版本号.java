package com.haijiao12138.demo.leetcode.九月.test0902;

/**
 * @author: haijiao12138
 * @ClassName: 比较版本号
 * @description: TODO
 * @date: 2021/9/2 15:41
 */
public class 比较版本号 {
    public static void main(String[] args) {

        String version1 = "1.01";
        String version2 = "1.001";
        int i = compareVersion(version1, version2);
        System.out.println("=========="+i);
    }
    public static int compareVersion(String version1,String version2){
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");
        for (int n = 0; n < Math.max(a1.length, a2.length); n++){
            int i = (n < a1.length ? Integer.valueOf(a1[n]):0);
            int j = (n < a2.length ? Integer.valueOf(a2[n]):0);
            if (i < j)
                return -1;
            else if(i > j){
                return 1;
            }
        }
        return 0;

    }
}
