package com.haijiao12138.demo.leetcode.code2021.九月.test0913;

import java.util.Stack;

/**
 * @author: haijiao12138
 * @ClassName: StackTest
 * @description: TODO
 * @date: 2021/9/13 21:37
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
    }
}
