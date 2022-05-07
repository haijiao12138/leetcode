package main.java.com.haijiao12138.demo.leetcode.code2022.day_0502;

import javax.crypto.Mac;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName 力扣32_最长有效括号_困难
 * @Author houyuanbo
 * @Date 2022/5/2 18:29
 * @Description TODO
 * @Version
 **/
public class 力扣32_最长有效括号_困难 {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses1(s));
    }


    //动态规划
    public static int longestValidParentheses1(String s) {
        int maxans = 0;
        int[] dp = new int[s.length()];// dp[i] 表示以下标 ii 字符结尾的最长有效括号的长度
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')'){
                if (s.charAt(i - 1) == '('){
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                }else  if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '('){//s.charAt(i - 1) == ')'
                    dp[i] = dp[i-1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0)+ 2;
                }
                maxans = Math.max(maxans,dp[i]);
            }
        }
        return maxans;

    }


    //栈
    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);//保持栈中有数据
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push(i);
            }else {//右括号
                stack.pop();//出栈
                if (stack.isEmpty()){
                    stack.push(i);
                }else {
                    maxans = Math.max(maxans,i-stack.peek());
                }
            }
        }
        return maxans;
    }
}
