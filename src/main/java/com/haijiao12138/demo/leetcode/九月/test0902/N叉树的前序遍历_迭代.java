package com.haijiao12138.demo.leetcode.九月.test0902;

import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: N叉树的前序遍历_迭代
 * @description: TODO
 * @date: 2021/9/2 17:18
 */
public class N叉树的前序遍历_迭代 {
//    public List<Integer> preorder(Node root) {
//        LinkedList<Integer> output =  new LinkedList<>();
//        if(root == null){
//            return output;
//        }
//        LinkedList<Node> stack =  new LinkedList<>();
//        stack.add(root);//进栈顺序，右孩子节点 左孩子节点 根节点
//        while(!stack.isEmpty()){
//            Node node = stack.pollLast();//检索并删除此列表的最后一个元素
//            output.add(node.val);
//            Collections.reverse(node.children);
//            for (Node item : node.children) {
//                stack.add(item);
//            }
//        }
//        return output;
//    }

  static   class Node {
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
