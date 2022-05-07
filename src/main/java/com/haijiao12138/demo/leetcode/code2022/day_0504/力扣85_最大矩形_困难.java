package main.java.com.haijiao12138.demo.leetcode.code2022.day_0504;

/**
 * @ClassName 力扣85_最大矩形_困难
 * @Author houyuanbo
 * @Date 2022/5/4 19:56
 * @Description TODO
 * @Version  动态规划
 **/
public class 力扣85_最大矩形_困难 {
    public static void main(String[] args) {
      char[][]   matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int i = maximalRectangle(matrix);
        System.out.println(i);
    }

    public static  int maximalRectangle(char[][] matrix){
        if (matrix.length ==0 || matrix[0].length == 0){
            return 0;
        }
        int col = matrix.length;
        int row = matrix[0].length;
        int[] heights = new int[row];
        int ans  = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] == '1'){
                    heights[j] +=1;
                }else {
                    heights[j] = 0;
                }
            }
            ans = Math.max(ans,力扣84_柱状图中最大的矩形.largestRectangleArea(heights));
        }
        return ans;
    }

}
