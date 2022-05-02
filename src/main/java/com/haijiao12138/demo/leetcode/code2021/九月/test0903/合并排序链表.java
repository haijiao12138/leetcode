package com.haijiao12138.demo.leetcode.code2021.九月.test0903;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: 合并排序链表
 * @description: TODO
 * @date: 2021/9/3 16:33
 */
public class 合并排序链表 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode11 = new ListNode(1);
        ListNode listNode33 = new ListNode(3);
        ListNode listNode44 = new ListNode(4);
        listNode11.next = listNode33;
        listNode33.next = listNode44;

        ListNode listNode22 = new ListNode(2);
        ListNode listNode66 = new ListNode(2);
        listNode22.next = listNode66;

        ListNode[] nodes = new ListNode[3];
        nodes[0] = listNode1;
        nodes[1] = listNode11;
        nodes[2] = listNode22;


        ListNode listNode = mergeKLists(nodes);
        while (listNode!=null){
            System.out.print(listNode.val+" ");
            listNode = listNode.next;
        }



    }

    public static ListNode mergeKLists(ListNode[] lists){
        //边界考虑
        if (lists.length == 0){
            return  null;
        }
        Queue<ListNode> heap = new PriorityQueue<>((ListNode a, ListNode b) -> (a.val - b.val));// 优先队列 先进先出
        for (int i = 0; i < lists.length; i++) {
            ListNode curHead = lists[i];
            while (curHead != null){
                heap.offer(curHead);//添加元素
                curHead = curHead.next;
            }
        }
        ListNode head = heap.poll();
        ListNode node = head;
        while (!heap.isEmpty()){
            node.next = heap.poll();
             node = node.next;
        }
        if (node != null)
            node.next = null;
        return head;
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
