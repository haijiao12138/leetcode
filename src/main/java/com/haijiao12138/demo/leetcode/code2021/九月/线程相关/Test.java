package com.haijiao12138.demo.leetcode.code2021.九月.线程相关;

/**
 * @author: haijiao12138
 * @ClassName: Run
 * @description: TODO
 * @date: 2021/9/5 22:40
 */
public class Test {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node reverse = reverse(node1);
        while (reverse != null){
            System.out.print(reverse.val + " ");
            reverse = reverse.next;
        }


    }

    public static Node reverse(Node head){
        Node pre = null;
        Node next =null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return  pre;
    }



    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
}
