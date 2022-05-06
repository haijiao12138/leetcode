package haijiao12138.demo.leetcode.code2022.五月.RecentCounter;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 */
public class RecentCounter {
  Deque<Integer> deq  =  new LinkedList<>();//定义队列
    public RecentCounter() {

    }

    public int ping(int t) {//1 100 3001 3002
        deq.addLast(t);
        while (deq.getFirst()+3000 < t ){//先进先出  每次拿出陷先进去的和当前的相比是不是有个3000的位差
            deq.pollFirst();
        }
        return deq.size();
    }
}
























