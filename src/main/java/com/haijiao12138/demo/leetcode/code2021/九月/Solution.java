package com.haijiao12138.demo.leetcode.code2021.九月;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: Solution
 * @description: TODO
 * @date: 2021/9/8 14:17
 */
public class Solution {
    public static void main(String[] args) {
       //testHashSet();
       // testHashMap();
        //testHashSetIterator();
        //testTreeMap();
        testHashTable();
    }

    /**
     * @author 候苑博
     * @Date 2021/9/12 13:04
     * @Description:  map中的数据是唯一 无序的（无序指的是不按着咱们放进去的顺序输出），自动将数据进行排序输出，没有重复元素
     */
    public static void testHashMap(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(5,5);
        map.put(2,2);
        map.put(3,3);
        //遍历方法1：
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {//遍历整个节点
           // System.out.println(item);
           // System.out.println(item.getKey());// 1 2 3 5
            System.out.println(item.getValue());
        }
        //遍历方法2
        for (Integer integer : map.keySet()) {//遍历key
            //System.out.println(map.get(integer));//结果1 2 3 5
        }
        //遍历方法3
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();//迭代器遍历
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("key:"+entry.getKey()+"--value:"+entry.getValue());//1-1,2-2,3-3,4-4
        }




    }

    public static void testHashSet(){
        int[] a = new int[]{5,3,3,1,5,4};
        Map<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            if (map.get(i)!=null){
                map.put(i,++i);
            }else {
                map.put(i,i);
            }
        }
        for (Integer integer : map.keySet()) {
            if (integer==map.get(integer)){
                System.out.print(integer+" ");
            }
        }
    }
    /**
     * @author 候苑博
     * @Date 2021/9/12 13:09
     * @Description: Set 唯一 无序（输入和输出顺序不一致）   数组自动按有序输出
     */
    public static void  testHashSetIterator(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(2);
        //遍历方式1-迭代器输出遍历
  /*      Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");//输出：1 2 3
        }*/
        //比那里输出2
        for (Integer integer : set) {
            System.out.print(integer+" ");//输出1 2 3
        }

    }

    //唯一 有序排列
    public static void testTreeMap(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1,"张三");
        map.put(5,"李四");
        map.put(2,"王五");
        map.put(1,"张柳");
        for (Map.Entry<Integer, String> temp : map.entrySet()) {
            System.out.println(temp.getKey());
        }
    }

    public static void testHashTable(){
        Hashtable<Integer, Integer> table = new Hashtable<>();
        table.put(1,22);
        table.put(2,34);
        table.put(5,23);
        System.out.println(table.toString());
        for (Integer integer : table.keySet()) {
            System.out.println(integer+"--"+table.get(integer));
        }
    }

}
