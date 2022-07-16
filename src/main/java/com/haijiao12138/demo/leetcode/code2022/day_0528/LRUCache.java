package com.haijiao12138.demo.leetcode.code2022.day_0528;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author:候苑博
 * @Date:2022-05-28 18:36
 * description:
 * Todo:
 */
public class LRUCache {
    public static void main(String[] args) {

    }

    int capacity;
    LinkedHashMap<Integer,Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest){
                return cache.size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key,-1);//有则返回 没有 返回-1
    }

    public void put(int key, int value) {
        cache.put(key,value);
    }
}
