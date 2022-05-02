package com.haijiao12138.demo.leetcode.code2022.五月.day_0502;

/**
 * @ClassName 力扣62_不同路径_中等
 * @Author houyuanbo
 * @Date 2022/5/2 20:21
 * @Description TODO
 * @Version
 **/
public class 力扣62_不同路径_中等 {
    public static void main(String[] args) {
        int i = uniquePaths(3, 2);
        System.out.println(i);
    }
    public static int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; i++) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j] = f[i-1][j] + f[i][j-1];
            }
        }
        return f[m-1][n-1];
    }
}
