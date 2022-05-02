package com.haijiao12138.demo.leetcode.code2021.九月.test0912;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: 华为od第一题面试官
 * @description: TODO
 * @date: 2021/9/12 21:40
 */
public class 华为od第一题面试官 {
    public static void main(String[] args) {
        int[] a = {2,3,5};
        int b =10;
        List<List<Integer>> lists = combinationSum(a, b);
        System.out.println(lists);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public static void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }

   /* public static void main(String[] args) {
        String test = test();
        System.out.println(test);
    }
    public static String test(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();//插入的位置
        String s = scanner.next();//之前的字符串

        String s1=null;
        int i1 = 0;
        if (i>1){
            s1 = scanner.next();//前进 或者后退的命令
            i1 = scanner.nextInt();
        }

        String s2 = scanner.next();//插入或者replace命令
        String s3 = scanner.next();//插入或者replace命令

        if (i == 1){
            //从初始位置进行操作
            if (s2.equals("REPLACE")){
                return s3;
            }else if (s2.equals("INSERT")){
                return s3+s;
            }

        }else {
            if (s1.equals("FORWARD")){
                if ( i1 >s.length()){
                    if (s2.equals("INSERT")){
                        return s+s3;
                    }else if (s2.equals("REPLACE")){
                        return s+s3;
                    }
                }else {
                    if (s2.equals("INSERT")){
                        StringBuffer stringBuilder1=new StringBuffer(s);
                        stringBuilder1.insert( i1,s3);
                        return String.valueOf(stringBuilder1);
                    }
                }
            }
        }
        return null;
    }*/
}
