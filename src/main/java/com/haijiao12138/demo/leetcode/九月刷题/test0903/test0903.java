package com.haijiao12138.demo.leetcode.九月刷题.test0903;

import com.haijiao12138.demo.leetcode.八月刷题.test0817.Solution1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: haijiao12138
 * @ClassName: test0903
 * @description: TODO
 * @date: 2021/9/3 11:18
 */
public class test0903 {
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;

        ListNode listNode = detectCycle(listNode1);
        System.out.println("====="+listNode.val);

    }

    public static ListNode detectCycle(ListNode head){
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null){
            if (visited.contains(pos)){
                return pos;
            }else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return  null;
    }

   static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}
