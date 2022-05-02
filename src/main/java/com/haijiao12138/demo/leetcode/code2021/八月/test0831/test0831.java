package com.haijiao12138.demo.leetcode.code2021.八月.test0831;

/**
 * @author: haijiao12138
 * @ClassName: test0831
 * @description: TODO
 * @date: 2021/8/31 15:19
 */
public class test0831 {
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

  static   class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNodeL = new TreeNode(2);
        TreeNode treeNodeR = new TreeNode(3);
        treeNode.left = treeNodeL;
        treeNode.right = treeNodeR;

        TreeNode treeNodeLL = new TreeNode(2);
        treeNodeL.left = treeNodeLL;
        int i = maxDepth(treeNode);
        System.out.println(i);


    }

}
