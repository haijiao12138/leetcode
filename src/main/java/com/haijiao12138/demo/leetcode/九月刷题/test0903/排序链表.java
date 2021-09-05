package com.haijiao12138.demo.leetcode.九月刷题.test0903;

import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: 排序链表
 * @description: TODO
 * @date: 2021/9/3 15:16
 */
public class 排序链表 {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        listNode4.next = listNode2;
        listNode2.next = listNode1;
        listNode1.next = listNode3;
        ListNode listNode = sortList(listNode4);
        while (listNode!=null){
            System.out.print(listNode.val+" ");
            listNode = listNode.next;
        }
    }
    public static ListNode sortList(ListNode head){
      return sortListTest(head,null);
    }
    public  static ListNode sortListTest(ListNode head,ListNode tail){
        if (head == null){
            return  head;
        }
        if (head.next == tail){
            head.next = null;
            return head;
        }
        ListNode slow = head,fast = head;
        while (fast != tail){//当快指针到最后的时候 慢指针到中间节点  找到中间节点
            slow =slow.next;
            fast = fast.next;
            if (fast != null){
                fast=fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortListTest(head, mid);
        ListNode list2 = sortListTest(mid, tail);
        ListNode sorted = merge(list1, list2);
        return sorted;
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead,temp1=head1,temp2 = head2;
        while (temp1!=null && temp2!=null){
            if (temp1.val < temp2.val){
                temp.next = temp1;
               temp1= temp1.next;
            }else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if (temp1 != null){
            temp.next = temp1;
        }else if(temp2 != null){
            temp.next = temp2;
        }
        return  dummyHead.next;
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
