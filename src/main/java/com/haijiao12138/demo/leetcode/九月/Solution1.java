package com.haijiao12138.demo.leetcode.九月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/9/8 14:17
 */


public class Solution1 {

  static   class  Node{
        public String ID;
        public String PID;
        Node(String ID,String PID){
            this.ID = ID;
            this.PID = PID;
        }
    }

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node("A","-1"));
        nodes.add(new Node("A-1","A"));
        nodes.add(new Node("A-2","A"));
        nodes.add(new Node("A-3","A"));
        nodes.add(new Node("A-2-1","A-2"));
        nodes.add(new Node("A-2-2","A-2"));
        nodes.add(new Node("A-2-3","A-2"));
        for (Node node : nodes) {
            if (!node.PID.equals("-1")){

            }
        }

    }
/*    public static String find(List<Node> nodes,Node node){
        if (node.PID.equals("-1")){
          return "A";
      }else {
         //return node.ID+ find( nodes,nodes.get(node.PID));
      }
    }*/
}
