package com.haijiao12138.demo.leetcode.code2021.八月.test0803;/**
 * @author 候苑博
 * @date 2021/8/3 9:15
 * @description
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author
 * @description
 * @date 2021/8/3
 *
 */
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
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val=3;
        TreeNode left1 = treeNode.left;
        TreeNode right1 = treeNode.right;
        left1.val = 9;
        left1.left = null;
        left1.right = null;
        right1.val = 20;
        TreeNode right2 = right1.right;
        TreeNode right2_left = right1.left;
        right2.val = 7;
        right2.right = null;
        right2.left = null;
        right2_left.val = 15;
        right2_left.right = null;
        right2_left.left = null;
        List<List<Integer>> lists = levelOrder(treeNode);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> listList = new ArrayList<>();
        if(root == null){
            return listList;//二叉树为空 直接返回
        }
        //定义队列
        LinkedList<Object> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size>0){
                TreeNode tempNode = (TreeNode) queue.poll();
                list.add(tempNode.val);
                if(tempNode.left!=null){
                    queue.add(tempNode.left);
                }
                if(tempNode.right != null){
                    queue.add(tempNode.right);
                }
                size--;
            }
            listList.add(list);
        }


        return listList;
    }
}
