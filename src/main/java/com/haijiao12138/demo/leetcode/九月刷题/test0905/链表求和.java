package com.haijiao12138.demo.leetcode.九月刷题.test0905;

/**
 * @author: haijiao12138
 * @ClassName: 链表求和
 * @description: TODO
 * 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
 * 输出：2 -> 1 -> 9，即912
 * @date: 2021/9/5 9:48
 */
public class 链表求和 {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int num = num1 + num2 + carry;
            carry = num / 10;

            cur.next = new ListNode(num % 10);

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            cur = cur.next;
        }
        if (carry == 1)
            cur.next = new ListNode(carry);
        return ans.next;


    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }
}
