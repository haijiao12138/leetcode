package com.haijiao12138.demo.leetcode.九月.test0903;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: N叉树的前序遍历
 * @description: TODO
 * @date: 2021/9/3 22:08
 */
public class 二叉树的前序遍历 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        List<Integer> list = preorderTravelsal(treeNode1);
        System.out.println(list);


    }

    public static List<Integer> preorderTravelsal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return  res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node =  root;
        while (!stack.isEmpty() || node!=null){
            while (node != null){//添加左节点
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
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
