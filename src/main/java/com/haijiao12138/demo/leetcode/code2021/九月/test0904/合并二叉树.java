package com.haijiao12138.demo.leetcode.code2021.九月.test0904;

/**
 * @author: haijiao12138
 * @ClassName: 合并二叉树
 * @description: TODO
 * @date: 2021/9/4 14:11
 */
public class 合并二叉树 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNodeL = new TreeNode(3);
        TreeNode treeNodeLL = new TreeNode(5);
        TreeNode treeNodeR = new TreeNode(2);
        treeNode.left = treeNodeL;
        treeNodeL.left = treeNodeLL;
        treeNode.right = treeNodeR;





        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode1L = new TreeNode(1);
        TreeNode treeNode1LR = new TreeNode(4);
        TreeNode treeNode1R = new TreeNode(3);
        TreeNode treeNode1RR = new TreeNode(7);
        treeNode1.left = treeNode1L;
        treeNode1.right = treeNode1R;
        treeNode1L.right = treeNode1LR;
        treeNode1R.right = treeNode1RR;

        TreeNode treeNode2 = mergeTrees(treeNode, treeNode1);

      if (treeNode2 != null){
          //System.out.println("==="+treeNode2.val);
          show(treeNode2);
      }

    }

    public static void show(TreeNode root){
        if (root != null){
             System.out.print(root.val+" ");
            show(root.left);
            show(root.right);
        }else if(root == null){
        }
    }

    public static TreeNode mergeTrees(TreeNode t1,TreeNode t2){
        if (t1 == null){
            return  t2;//第一颗树为空时  返回第二棵树
        }
        if (t2 == null){
            return  t1;
        }
        //合并根节点
        t1.val  += t2.val;
        //递归合并左子树
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return  t1;
    }


   static class  TreeNode{
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
