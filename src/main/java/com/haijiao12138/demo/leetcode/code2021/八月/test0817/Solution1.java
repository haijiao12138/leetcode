package com.haijiao12138.demo.leetcode.code2021.八月.test0817;

/**
 * @author: haijiao12138
 * @ClassName: Solution1
 * @description: TODO
 * @date: 2021/8/17 18:01
 */
public class Solution1 {
      public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        head1.val = 1;
        ListNode head2 = new ListNode();
        head2.val = 2;
        ListNode head3 = new ListNode();
        head3.val = 3;
        ListNode head4 = new ListNode();//1 2 3 4
        head4.val = 4;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = null;

        ListNode listNode = swapPairs(head1);
       //System.out.println(listNode);
        //ListNode listNode = swapPairs(head);
        while (listNode.next!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
        //System.out.println(listNode);
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode next= head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
