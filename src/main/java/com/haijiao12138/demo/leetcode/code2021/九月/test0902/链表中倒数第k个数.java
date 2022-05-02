package com.haijiao12138.demo.leetcode.code2021.九月.test0902;

/**
 * @author: haijiao12138
 * @ClassName: 链表中倒数第k个数
 * @description: TODO
 * @date: 2021/9/2 15:32
 */
public class 链表中倒数第k个数 {
    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        ListNode kthFromEnd = getKthFromEnd(listNode2, 3);
        System.out.println(kthFromEnd.val);

    }
    public static ListNode getKthFromEnd(ListNode head,int k){
        ListNode fast = head,slow = head;
        for (int i = 0; i < k; i++) {
            fast=fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
