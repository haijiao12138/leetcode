package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @ClassName 力扣538_把二叉搜索树转换为累加树_中等
 * @Author houyuanbo
 * @Date 2022/5/8 16:43
 * @Description TODO
 * @Version
 **/
public class 力扣538_把二叉搜索树转换为累加树_中等 {
    public static void main(String[] args) {

    }
   static int num = 0;
    public static TreeNode convertBST(TreeNode root) {
        if (root !=null){
            //遍历右子树
            convertBST(root.right);
            //遍历顶节点
           root.val = root.val + num;
           num = root.val;
           //遍历左子树
            convertBST(root.left);
            return root;
        }
        return null;
    }
   public class TreeNode {
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
