package com.haijiao12138.demo.leetcode.code2021.九月;

public class Test {

    static int deep;  //树的深度
    static int res;  //返回的树节点的值

    public static void main(String[] args) {


    }

    public static int test(ListTree root){
        deep = -1;
        dfs(root, 0);
        return res;
    }

    public static void dfs(ListTree root,int d){
        if (root == null){
            return;
        }

        if (d > deep){
            deep = d;
            res = root.value;
        }
        //前序遍历
        dfs(root.left, d + 1);
        dfs(root.right, d + 1);
    }

    class ListTree{
        ListTree left;
        ListTree right;
        int value;
        ListTree(int x){
            value = x;
        }
        ListTree(ListTree left, ListTree right, int value){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

//    public static ListNode test(ListNode head){
//        if(head == null){
//            return null;
//        }
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null){
//            ListNode temp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = temp;
//        }
//        return pre;
//    }

//    class ListNode{
//        int value;
//        ListNode next;
//        ListNode(int x){
//            value = x;
//        }
//    }
}

