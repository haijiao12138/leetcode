package com.haijiao12138.demo.leetcode.九月刷题.test0902;


/**
 * @author: haijiao12138
 * @ClassName: 二叉搜索树的最小绝对差
 * @description: TODO
 * @date: 2021/9/2 12:01
 */
public class 二叉搜索树的最小绝对差 {

    private int result = Integer.MAX_VALUE;
    private TreeNode preNode = null;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
       TreeNode treeNodeL = new TreeNode(0);
        TreeNode treeNodeR = new TreeNode(8);
        TreeNode treeNodeRL = new TreeNode(6);
       treeNode.left = treeNodeL;
        treeNode.right = treeNodeR;
        treeNodeR.left = treeNodeRL;
        二叉搜索树的最小绝对差 aa = new 二叉搜索树的最小绝对差();

        int minimumDifference = aa.getMinimumDifference(treeNode);
        System.out.println("============="+minimumDifference);


    }
    public int getMinimumDifference(TreeNode root){
        //二叉查找树的中，中间节点的值一定是其左右节点的中间数，因此 最小差别的一定是在中间节点和左右节点之间
        //中序遍历二叉树  每次查找 当前节点和中间节点的差值  和当前result中的值进行比较 不断进行更新   将较小的值保存在result中
        getMin(root);
        return result;
    }
    private void getMin(TreeNode root){
        if(root == null){
            return ;
        }
        getMin(root.left);
        if (preNode != null){
            result = Math.min(Math.abs(root.val - preNode.val),result);
        }
        preNode = root;//记录根节点
        getMin(root.right);
    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
