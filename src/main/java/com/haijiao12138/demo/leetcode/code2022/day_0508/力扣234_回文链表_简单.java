package com.haijiao12138.demo.leetcode.code2022.day_0508;



import java.util.Stack;

/**
 * @Author:候苑博
 * @Date:2022-05-08 1:34
 * description:  栈存放
 * Todo:
 */
public class 力扣234_回文链表_简单 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        while (head!=null){
            if (stack.pop() != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
