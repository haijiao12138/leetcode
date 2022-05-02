package com.haijiao12138.demo.leetcode.code2021.九月.test0906;

/**
 * @author: haijiao12138
 * @ClassName: Test
 * @description: TODO
 * @date: 2021/9/7 20:53
 */
public class Test {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
    }
    public static int print(int[][] arr){
        int n = arr.length;
//        00 01 02 03
//        10 11 12 13
//        20 21 22 23
//        30 31 32 33

           int m = 0;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[0][i]+" ");    // 1 2 5
                    int k = i;
                     m=0;
                    while (k != 0 ){
                        System.out.print(arr[++m][--k]+" ");

                    }
            }
            int q = 1;
             n = n-1;
            for (int j = n; j >= 1 ;j=n ) {
                if (q >n){
                    break;
                }
                System.out.print(arr[q++][j] + " ");
                int p = q;
                while (p != n+1){
                    System.out.print(arr[p++][--j]+" ");
                }
            }


        return 0;
    }
}
