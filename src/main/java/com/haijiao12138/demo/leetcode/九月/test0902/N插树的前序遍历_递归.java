package com.haijiao12138.demo.leetcode.九月.test0902;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: N插树的前序遍历_递归
 * @description: TODO
 * @date: 2021/9/2 17:02
 */
public class N插树的前序遍历_递归 {
    static  List<Integer> res = new ArrayList<Integer>();
    public static void main(String[] args) {
        Node node = new Node(1);

        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);

        Node node4 = new Node(5);
        Node node5 = new Node(6);


        List<Node> node11 = new ArrayList<Node>();
        node11.add(node1);
        node11.add(node2);
        node11.add(node3);

        List<Node> node12 = new ArrayList<Node>();
        node12.add(node4);
        node12.add(node5);
        node1.children = node12;

        Node node6 = new Node(1, node11);

        List<Integer> preorder = preorder(node6);
        System.out.println(preorder);





    }

    public static List<Integer> preorder(Node root) {
        //进行递归
        if(root == null){
            return res;
        }
        res.add(root.val);
        if (root.children != null){
            for(Node child : root.children){//进行子树的遍历
                preorder(child);
            }
        }
        return res;
    }

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
