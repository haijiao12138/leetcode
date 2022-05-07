package com.haijiao12138.demo.leetcode.code2022.day_0507;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author:候苑博
 * @Date:2022-05-07 19:58
 * description:   根据前序遍历的第一个值是根节点 分别进行在中序遍历的左右递归进行构造
 * Todo:
 */
public class 力扣105_从前序和中序遍历构造二叉树_中等 {
    public static void main(String[] args) {

    }


    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0){
          return null;
        }
        TreeNode root = new TreeNode(preorder[0]);//构造根节点
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]){
                //确定中序遍历中的根节点的位置 然后分别左右递归遍历
                root.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                root.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
                break;
            }
        }
        return root;
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
