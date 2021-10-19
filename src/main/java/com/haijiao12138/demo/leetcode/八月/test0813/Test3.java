package com.haijiao12138.demo.leetcode.八月.test0813;


import java.util.HashMap;

/**
 * @author: 候苑博
 * @ClassName: Test3
 * @description: TODO  备课面试第三题 奇特区间
 * @date: 2021/8/13 20:51
 *
 */
public class Test3 {
    public static void main(String[] args) {

        int[] a = {2,3,4};
        int test = test(a, 6);
        System.out.println(test);

    }
    public static int test(int[] A,int t){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int left = -1;
        int right = -1;
        for (int i = 0; i < A.length ;i++) {
            Integer key = A[i]^ t;
            Integer value = map.get(key);
            if(value != null){
                sum+=value+1;
                right = i;
                left = value;
            }
            map.put(A[i],i);
        }
        sum+=(left+1)*(A.length - right);
        return (A.length * A.length - 1)/2 - sum;
    }

}
