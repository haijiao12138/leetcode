package com.haijiao12138.demo.leetcode.code2022.五月.day_0502;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName 力扣1305_两棵二叉搜索树中的所有元素_中等
 * @Author houyuanbo
 * @Date 2022/5/2 17:16
 * @Description TODO  中序遍历+归并排序
 * @Version
 **/
public class 力扣1305_两棵二叉搜索树中的所有元素_中等 {
    public static void main(String[] args) {

    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        inorder(root1,nums1);
        inorder(root2,nums2);
        ArrayList<Integer> merged = new ArrayList<Integer>();
        int p1=0,p2=0;
        while (true){
            if (p1 == nums1.size()){
                merged.addAll(nums2.subList(p2,nums2.size()));//list1中的合并结束 直接将list2中的数据复制到合并的list中
                break;
            }
            if (p2 == nums2.size()){
                merged.addAll(nums1.subList(p1,nums1.size()));//list2中的合并结束 直接将list1中的数据复制到合并的list中
                break;//终止条件
            }
            if (nums1.get(p1) < nums2.get(p2)){//nums1中的小 加入到合并list中
                merged.add(nums1.get(p1++));
            }else {
                merged.add(nums2.get(p2++));
            }
        }
        return  merged;

    }
    //树的中序遍历
    public static void  inorder(TreeNode node,List<Integer> res){
        if (node != null){
            inorder(node.left,res);
            res.add(node.val);
            inorder(node.right,res);
        }
    }
}

//统一树节点
 class TreeNode{
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
