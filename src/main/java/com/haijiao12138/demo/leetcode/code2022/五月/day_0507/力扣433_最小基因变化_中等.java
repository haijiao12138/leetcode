package com.haijiao12138.demo.leetcode.code2022.五月.day_0507;

import org.junit.Test;

import java.util.ArrayList;


/**
 * 广度优先搜索
 */
public class 力扣433_最小基因变化_中等 {
    public static void main(String[] args) {
        String a = "AACCGGTT";
        String b = "AACCGGTA";
        String[] c = {"AACCGGTA"};
        int i = minMutation(a, b, c);
        System.out.println(i);
    }
    public static int minMutation(String start, String end, String[] bank) {

        if (start.equals(end)){
            return 0;
        }
        if (bank.length == 0){
            return -1;
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(start);
        int[] def = new int[bank.length];//对于每个bank串中的值  都标记为0
        int times = 0;
        while (!list.isEmpty()){
            times++;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < bank.length; j++) {
                    if ((def[j] !=1) && des(list.get(0),bank[j])==1){
                        //首先判断在目标交换数组中的字符串是不是end字符串 如果是 直接返回次数
                        if (end.equals(bank[j])){
                            return times;
                        }else {
                            def[j] = 1;//如果不相等的话  就进行标记 并开始下一个
                            list.add(bank[j]);//该就是进行变换后的下一个
                        }
                    }
                }
                list.remove(0);//每次移除前一个 保留后一个
            }
        }
        return -1;

    }
    public static int des(String a,String b){//比较原来的字符串和目标数组中的字符串是不是差1个如果是 就可能是最后的end字符串
        int p = 0;
        for (int i = 0; i < 8; i++) {
            if (a.charAt(i) != b.charAt(i)){
                ++p;
            }
        }
        return p;
    }

}
