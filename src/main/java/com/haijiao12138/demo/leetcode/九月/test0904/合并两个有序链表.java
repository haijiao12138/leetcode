package com.haijiao12138.demo.leetcode.九月.test0904;

/**
 * @author: haijiao12138
 * @ClassName: 合并两个有序链表
 * @description: TODO
 * @date: 2021/9/4 19:34
 */
public class 合并两个有序链表 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        listNode.next = listNode1;//第一个链表
        listNode1.next = listNode2;

        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode merge = merge(listNode, listNode3);

        while (merge != null){
            System.out.print(merge.val+" ");
            merge = merge.next;
        }


    }

    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode listNode = new ListNode();
        ListNode cur = listNode;
        while (l1!= null && l2!=null){
            if (l1.val < l2.val){
                cur.next = l1;  //小的放在后面
                cur = cur.next;//新链表节点 往后移动
                l1 = l1.next; //往后移动
            }else {
                cur.next = l2;
                cur = cur.next;//新链表节点 往后移动
                l2 = l2.next;
            }
        }//循环完毕

        //任意为空  直接连接另一条链表
        if (l1 == null){
            cur.next = l2;
        }else{
            cur.next = l2;
        }
        return listNode.next;



    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val  = val;}
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
