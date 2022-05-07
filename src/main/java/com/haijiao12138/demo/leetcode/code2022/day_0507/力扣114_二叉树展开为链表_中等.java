package com.haijiao12138.demo.leetcode.code2022.day_0507;

/**
 * @Author:候苑博
 * @Date:2022-05-08 0:57
 * description:
 * Todo:
 */
public class 力扣114_二叉树展开为链表_中等 {
    public static void main(String[] args) {

    }

    public static void flatten(TreeNode root) {
        if (root == null){
           return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode tmp = root.right;//先将右子树存起来
        root.right = root.left;//将左子树变为当前根节点的右子树
        root.left = null;//将当前的左子树为null
        while (root.right !=  null){
            root = root.right;
        }
        root.right = tmp;
    }
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
