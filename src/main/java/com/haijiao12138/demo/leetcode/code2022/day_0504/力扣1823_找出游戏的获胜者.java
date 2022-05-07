package main.java.com.haijiao12138.demo.leetcode.code2022.day_0504;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName 力扣1823_找出游戏的获胜者
 * @Author houyuanbo
 * @Date 2022/5/4 12:19
 * @Description TODO
 * @Version 约瑟夫环
 **/
public class 力扣1823_找出游戏的获胜者 {
    public static void main(String[] args) {
        int theWinner = findTheWinner1(7, 3);
        System.out.println(theWinner);
    }

    //数学公式
    public static int findTheWinner(int n,int k){
        int p = 0;
        for (int i = 2; i <= n ; i++) {
            p = (p + k)% i;
        }
        return p+1;
    }
    //队列模拟
    public  static int findTheWinner1(int n,int k){ //                                   4
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            q.add(i);//数字入队
        }
        for (int i = 1; i <n ; i++) {//  七个数 进行六次 就可以结束了
            for (int j = 1; j < k; j++) {  //每次将前面的数放到队列前面 然后将对应的数进行出队列   以此类推进行循环
                q.add(q.poll());
            }
            q.poll();
        }
        return  q.poll();


    }
}
