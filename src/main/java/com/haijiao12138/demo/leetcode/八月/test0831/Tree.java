package com.haijiao12138.demo.leetcode.八月.test0831;

/**
 * @author: haijiao12138
 * @ClassName: Tree
 * @description: TODO
 * 前序遍历:GDAFEMHZ
 * 中序遍历:ADEFGHMZ
 * 求后续遍历
 * @date: 2021/8/31 11:14
 */
public class Tree {
    public static void main(String[] args) {
        String pre = "GDAFEMHZ";
        String mid = "ADEFGHMZ";
        String s = postOrder(pre, mid);
        System.out.println(s);
    }
    public static String postOrder(String pre,String mid){

        if (pre.length() == 1){
            return pre;
        }else if (pre.length() == 0){
            return "";
        }
        String root,left,right;
        root = String.valueOf(pre.charAt(0));//拿到根节点
        int m= mid.indexOf(root);//在中序遍历的位置
        left =postOrder(pre.substring(1,m+1),mid.substring(0,m));
        right =postOrder(pre.substring(m+1),mid.substring(m+1));
        return left+right+root;
    }
    //倒序02  O1



}
