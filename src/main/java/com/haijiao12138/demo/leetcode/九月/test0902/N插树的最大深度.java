package com.haijiao12138.demo.leetcode.九月.test0902;

import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: N插树的最大深度
 * @description: TODO
 * @date: 2021/9/2 13:22
 */
public class N插树的最大深度 {
    public static void main(String[] args) {

    }
   /* public static int maxdepth(){

    }*/

   static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
