package com.haijiao12138.demo.leetcode.test0821;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/8/21 16:48
 */
public class Solution {

    public static void main(String[] args) {
        int[][] aa = {{1,2,1},{2,3,1},{1,3,3},{3,4,1},{4,1,1}};
        int[][] floyd = floyd(aa);
        for (int[] ints : floyd) {
            System.out.println(Arrays.toString(ints));
        }

    }
    public static int[][] floyd(int[][] initialGraph){
        int[][] resultGrapg=initialGraph.clone();

        for(int k=0; k<resultGrapg[0].length; k++) {
            for(int i=0; i<resultGrapg[0].length; i++) {
                for(int j=0; j<resultGrapg[0].length; j++) {
                    if(resultGrapg[i][j]>resultGrapg[i][k]+resultGrapg[k][j]) {
                        resultGrapg[i][j]=resultGrapg[i][k]+resultGrapg[k][j];
                    }
                }
            }
        }



        return resultGrapg;
    }

}
