package com.haijiao12138.demo.leetcode.九月刷题.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 岛屿最大面积
 * @description: TODO
 * @date: 2021/9/5 10:54
 */
public class 岛屿最大面积 {

    public static void main(String[] args) {
        int[][] arr = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int i = maxAreaOfIsland(arr);
        System.out.println("=============="+i);
    }
      public static int maxAreaOfIsland(int[][] grid) {
            int max = 0;
            for(int i = 0; i < grid.length; i++){//行的宽度
                for(int j = 0; j < grid[0].length; j++){//列的宽度
                    if(grid[i][j] == 1){
                        max = Math.max (dfs(grid, i, j), max);
                    }
                }
            }
            return max;
        }
      public static   int dfs(int[][] grid, int i, int j){
            if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
                return 0;
            }
            grid[i][j] = 0;
            int count = 1;
            count += dfs(grid, i+1, j);
            count += dfs(grid, i-1, j);
            count += dfs(grid, i, j+1);
            count += dfs(grid, i, j-1);
            return count;
        }
}
