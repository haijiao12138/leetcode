package com.haijiao12138.demo.leetcode.code2021.九月.test0911;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author: haijiao12138
 * @ClassName: 后序加中序得到层次遍历
 * @description: TODO
 * @date: 2021/9/11 14:56
 */

public class 后序加中序得到层次遍历 {
    static List<List<Integer>> list=new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        int[] intArr = new int[a.length()];
        int[] intBrr = new int[b.length()];
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            intArr[i] = (int) cha[i] - 48;
        }
        for (int i = 0; i < b.length(); i++) {
            intBrr[i] = (int) chb[i] - 48;
        }

        TreeNode root=buildTree(intBrr,intArr);
        levelOrder(root);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print((char)('0' + list.get(i).get(j)));
            }

        }

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree1(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    public static TreeNode buildTree1(int[] inorder, int inLeft, int inRight,
                                      int[] postorder, int postLeft, int postRight) {
        // 没有元素了
        if (inRight - inLeft < 1) {
            return null;
        }
        // 只有一个元素了
        if (inRight - inLeft == 1) {
            return new TreeNode(inorder[inLeft]);
        }
        // 后序数组postorder里最后一个即为根结点
        int rootVal = postorder[postRight - 1];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = 0;
        // 根据根结点的值找到该值在中序数组inorder里的位置
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
            }
        }
        // 根据rootIndex划分左右子树
        root.left = buildTree1(inorder, inLeft, rootIndex,
                postorder, postLeft, postLeft + (rootIndex - inLeft));
        root.right = buildTree1(inorder, rootIndex + 1, inRight,
                postorder, postLeft + (rootIndex - inLeft), postRight - 1);
        return root;
    }

    public static  List<List<Integer>> levelOrder(TreeNode root) {
        addfind(root,0);
        return list;
    }

    public static void addfind(TreeNode root,int k){
        if(root!=null){
            if(list.size()<=k){
                list.add(new ArrayList<Integer>());

            }
            list.get(k).add(root.val);
            addfind(root.left,k+1);
            addfind(root.right,k+1);
        }

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
