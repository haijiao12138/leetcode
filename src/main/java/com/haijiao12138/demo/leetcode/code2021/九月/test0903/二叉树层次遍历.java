package com.haijiao12138.demo.leetcode.code2021.九月.test0903;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: 二叉树层次遍历
 * @description: TODO
 * @date: 2021/9/3 19:51
 */
public class 二叉树层次遍历 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        root.left = left;
        root.right = right;
        right.left = rightLeft;
        right.right = rightRight;
        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);


    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> listList = new ArrayList<>();
        if (root == null){
            //二叉树为空
            return listList;
        }
        Queue<TreeNode> queue = new LinkedList<>();//定义队列
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0){
                TreeNode tempNode = queue.poll();
                list.add(tempNode.val);
                if (tempNode.left != null){
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null){
                    queue.add(tempNode.right);
                }
                size--;
            }
            listList.add(list);
        }
        return listList;


    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
