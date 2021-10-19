package com.haijiao12138.demo.leetcode.九月.test0920;

/**
 * @author: haijiao12138
 * @ClassName: 求根节点到叶子结点之和
 * @description: TODO
 * @date: 2021/9/22 17:06
 */
public class 求根节点到叶子结点之和 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        int dfs = dfs(treeNode1, 0);
        System.out.println("结果是："+dfs);
    }


    public static int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }


    static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
 }
}
