package com.haijiao12138.demo.leetcode.九月.test0911;


import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: 集合测试联系
 * @description: TODO
 * @date: 2021/9/11 12:30
 */
public class 集合测试练习 {
    public static void main(String[] args) {
        // arrayListTest();
        //linkedList();
        linkedListToStack();
    }

    public static void arrayListTest() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        System.out.println(list);
        System.out.println(list.size());
    }

    public static void linkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.size());
        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }

    }

    public static void linkedListToStack() {
        StackL stackL = new StackL();
        for (int i = 0; i < 10; i++) {
            stackL.push(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(stackL.pop() + " ");
        }
    }

    static class StackL {
        private LinkedList list = new LinkedList();

        public void push(Object v) {
            list.addFirst(v);
        }

        public Object top() {
            return list.getFirst();
        }

        public Object pop() {
            return list.removeFirst();
        }
    }
}