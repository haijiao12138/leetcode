package com.haijiao12138.demo.leetcode.九月.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 图像渲染
 * @description: TODO
 * @date: 2021/9/5 11:04
 */
public class 图像渲染 {
    public static void main(String[] args) {
        int[][] arr =  {{1,1,1},{1,1,0},{1,0,1}};
        int[][] ints = floodFill(arr, 1, 1, 2);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //使用递归进行颜色渲染
        return dfs(image,sr,sc,newColor,image[sr][sc]);
        //image.length  二维数组有几行
    }
    public static int[][] dfs(int[][] image,int i,int j,int newColor,int num){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]==newColor || image[i][j]!=num){

        }else{
            int temp=image[i][j];
            image[i][j]=newColor;
            dfs(image, i+1, j, newColor, temp);
            dfs(image, i-1, j, newColor, temp);
            dfs(image, i, j+1, newColor, temp);
            dfs(image, i, j-1, newColor, temp);

        }
        return image;

    }
}
