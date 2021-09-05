package com.haijiao12138.demo.leetcode.九月刷题.test0903;

/**
 * @author: haijiao12138
 * @ClassName: 反转单链表迭代法
 * @description: TODO
 * @date: 2021/9/3 12:37
 */
public class 反转单链表迭代法 {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
//网络信息公司

