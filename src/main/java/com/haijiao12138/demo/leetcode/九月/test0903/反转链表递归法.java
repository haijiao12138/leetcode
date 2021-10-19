package com.haijiao12138.demo.leetcode.九月.test0903;

/**
 * @author: haijiao12138
 * @ClassName: 反转链表递归法
 * @description: TODO
 * @date: 2021/9/3 12:00
 */
public class 反转链表递归法 {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head){
        if (head == null && head.next == null){
            return  head;
        }
        ListNode p = reverseList(head.next);//递归到最后的值
        head.next.next = head;
        head.next = null;
        return p;
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
