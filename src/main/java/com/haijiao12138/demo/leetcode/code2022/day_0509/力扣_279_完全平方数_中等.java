package com.haijiao12138.demo.leetcode.code2022.day_0509;

/**
 * @ClassName 力扣_279_完全平方数_中等
 * @Author houyuanbo
 * @Date 2022/5/9 19:35
 * @Description TODO
 * @Version  完全背包
 **/
public class 力扣_279_完全平方数_中等 {
    public static void main(String[] args) {

    }

    /**
     * @Author houyuanbo
     * @Date 19:44 2022/5/9
     * @Param [n]  任意可构成完全平方和的数都是由 1 2 3 4
     * @return
     * @Description   <1> dp[i] 和为i的完全平方数的最小数量市dp[i]
     *                 [2] dp[j]可以由dp[j-i*i]推出   dp[j] = dp[j -i*i]+1；==》选择最小的dp【j】  ==>dp[j]=min(dp[j-i*i]+1,dp[j]);
     *                 [3]  dp数组初始化  即dp[0]=0   和为0的完全平方数的最小数量是0
     *                 [4]   确定遍历顺序
     *                    如果求组合数就是外层for循环遍历物品，内层for遍历背包。
     *                    如果求排列数就是外层for遍历背包，内层for循环遍历物品。
     **/
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <=n; i++) {//遍历背包
            dp[i] = 1;
            for (int j = 1; j*j <=i ; j++) {//遍历物品
                dp[i] = Math.min(dp[i],dp[i - j*j]+1);
            }
        }
        return dp[n];
    }
}
