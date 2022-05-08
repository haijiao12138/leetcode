package com.haijiao12138.demo.leetcode.code2022.day_0508;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName 力扣406_根据身高重建队列_中等
 * @Author houyuanbo
 * @Date 2022/5/8 19:17
 * @Description TODO
 * @Version
 **/
public class 力扣406_根据身高重建队列_中等 {
    public static void main(String[] args) {
        int[][] arr = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ints = reconstructQueue(arr);

    }

    public static int[][] reconstructQueue(int[][] people) {
        //身高从大到小排  身高相同 k值小的在前面70 71
        Arrays.sort(people,(a,b) ->{
            if (a[0] == b[0]){
                return a[1] - b[1];//大于0  从小往大排
            }
            return b[0] - a[0];//大于0 从大到小排
        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] p : people) {
            que.add(p[1],p);
        }
        return que.toArray(new int[people.length][]);
    }


}
