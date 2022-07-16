package com.haijiao12138.demo.leetcode.code2022.day_0528;

/**
 * @Author:候苑博
 * @Date:2022-05-28 20:54
 * description:
 * Todo:
 */
public class 力扣_二叉树的最近公共祖先 {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        if (root ==p || root ==q){
            return  root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left!=null && right!=null){
            return root;
        }else if (left != null){
            return left;
        }else if (right != null){
            return  right;
        }
        return null;
    }

  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
