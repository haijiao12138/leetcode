package com.haijiao12138.demo.leetcode.九月.test0919;

/**
 * @author: haijiao12138
 * @ClassName: 找到中间节点
 * @description: TODO
 * @date: 2021/9/18 17:42
 */
public class 找到中间节点 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next = listNode4;
        listNode4.next=listNode5;
        ListNode listNode = middleNode(listNode1);
        System.out.println("中间值是"+listNode.val);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode last = head;
        while (last != null && last.next != null) {
            last = last.next.next;
            first = first.next;
        }
        return first;

    }


}
