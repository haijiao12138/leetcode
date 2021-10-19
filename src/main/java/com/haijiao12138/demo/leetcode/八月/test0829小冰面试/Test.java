package com.haijiao12138.demo.leetcode.八月.test0829小冰面试;

/**
 * @author: haijiao12138
 * @ClassName: Test
 * @description: TODO
 * @date: 2021/8/30 18:06
 */
public class Test {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode reverse = reverse(listNode1);
        while (reverse != null) {
            System.out.println(reverse.value);
            reverse = reverse.next;
        }
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode result = new ListNode(head.value);
        head = head.next;
        while (head != null) {
            ListNode res = new ListNode(head.value);
            res.next = result;
            result = res;
            head = head.next;
        }
        return result;

    }

}

class ListNode {
    int value;
    ListNode next;

    ListNode(int x) {
        value = x;
    }
}
