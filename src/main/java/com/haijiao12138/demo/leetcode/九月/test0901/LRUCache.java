package com.haijiao12138.demo.leetcode.九月.test0901;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: haijiao12138
 * @ClassName: LRUCache
 * @description: TODO  java实现LRU算法  最近最少未使用算法
 * @date: 2021/9/1 21:26
 */
public class LRUCache extends LinkedHashMap<Integer,Integer> {
    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75F,true);
        this.capacity = capacity;
    }
    public int get(int key){
        return super.getOrDefault(key,-1);
    }

    public void put(int key,int value) {
        super.put(key, value);
    }
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.put(4,4);
        lruCache.put(5,5);
        lruCache.get(1);//现在使用key为1的这个数据  淘汰的时候 就会从最近最少未使用的key=2的时候 开始淘汰
        lruCache.put(6,6);
        String s = lruCache.toString();
        System.out.println(s);

    }

}
