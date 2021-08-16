package com.haijiao12138.demo.leetcode.test0805;/**
 * @author 候苑博
 * @date 2021/8/5 21:00
 * @description
 */

/**
 * @author
 * @description
 * @date 2021/8/5
 *
 */
public class CountWays {
    public static void main(String[] args) {
        int i = countWays(111);
        System.out.println("======"+i);
    }
    public static int countWays(int n) {
        //动态规划
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else if(n==3){
            return 2;
        }else{
            long[] row = new long[n];

            row[0]=0;
            row[1]=1;
            row[2]=2;
            for(int i=3;i<n;i++){
                row[i]=row[i-1]%1000000007+row[i-2]%1000000007;
            }
            return ((int)row[n-1]%1000000007);
        }

    }

}
