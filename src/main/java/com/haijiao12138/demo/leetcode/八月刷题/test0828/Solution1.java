package com.haijiao12138.demo.leetcode.八月刷题.test0828;

/**
 * @author: haijiao12138
 * @ClassName: Solution1
 * @description: TODO
 * @date: 2021/8/28 20:32
 */
public class Solution1 {
    public  int findTilt(TreeNode root) {
        if(root == null)
            return 0;
        return Math.abs(sum(root.left)-sum(root.right))+findTilt(root.left)+findTilt(root.right);
    }
    public int sum(TreeNode root){
        if(root == null)
            return 0;
        return root.val +sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        TreeNode nodeLeft = new TreeNode(2);
        TreeNode nodeLeftL = new TreeNode(3);
        TreeNode nodeLeftR = new TreeNode(5);
        nodeLeft.left = nodeLeftL;nodeLeft.right=nodeLeftR;
        TreeNode nodeRight = new TreeNode(9);
        TreeNode nodeRightR = new TreeNode(7);
        nodeRight.left = null;nodeRight.right=nodeRightR;
        node.left = nodeLeft;
        node.right = nodeRight;
        Solution1 s = new Solution1();
        int tilt = s.findTilt(node);
        System.out.println("=============="+tilt);

    }
}
class TreeNode {
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
