package com.haijiao12138.demo.leetcode.code2022.day_0528;

import java.util.*;

/**
 * @Author:候苑博
 * @Date:2022-05-28 18:52
 * description:
 * 从入度出发 构建广度优先搜索
 * 从出度出发  构建深度优先搜索
 * Todo:
 */
public class 力扣_课程表_中等_207 {
    public static void main(String[] args) {
        int num = 2;
        int[][] prerequisites = {{0,10},
                                {3,18},
                                {5,5},
                                {6,11},
                                {13,1},
                                {15,1},
                                {17,4},
                                {11,14}};
        boolean b = canFinish(20,prerequisites);

    }
    static List<List<Integer>> edges;
    static int[] indeg;
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            ++indeg[info[0]];//{0,10}   0的先修课程是10
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0){
                queue.offer(i);//谁的先修课程是0 的时候   就将其入队   队列中的课程都是没有先修课程的
            }
        }
        int visited = 0;
        while (!queue.isEmpty()){
            ++visited;
            Integer u = queue.poll();
            for (Integer v : edges.get(u)) {
                --indeg[v];
                if (indeg[v] == 0){
                    queue.offer(v);
                }
            }
        }






        return visited == numCourses;
    }
}
