package com.haijiao12138.demo.leetcode.八月刷题.test0817;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/8/17 17:32
 */
public class Solution {

    public static void main(String[] args) {

        String s = "ALLAPPL";
        boolean b = checkRecord(s);
        System.out.println(b);

    }

    //P-P-A-L-L-P
    public static boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int countA = 0;
        int countL = 0;
        for (char aChar : chars) {
            if (aChar == 'A'){
                countA++;
                countL =0;
            }else if(aChar == 'L'){
                countL++;
            }else {
                countL =0;
            }
            if(countA>=2 || countL>=3){
                return false;
            }
        }

        return true;
    }
}
