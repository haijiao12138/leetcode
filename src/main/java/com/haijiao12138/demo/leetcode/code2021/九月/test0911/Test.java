package com.haijiao12138.demo.leetcode.code2021.九月.test0911;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: Test
 * @description: TODO
 * @date: 2021/9/11 20:16
 */
public class Test {
    public static void main(String[] args) {
       int[] arr = {1,1,4,7,7};
//        List<Integer> test = test(arr);
//        System.out.println(test);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(2);
        set.add(15);
        set.add(0);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }
    public static List<Integer> test(int[] arr){
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(1);
        set.add(5);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }



        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(arr[i])==null){
                map.put(arr[i],arr[i]);
            }else {
                map.put(arr[i],arr[i]+1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer)==integer){
                list.add(integer);
            }
        }
        return list;
    }

}
