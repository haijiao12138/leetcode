package com.haijiao12138.demo.leetcode.code2021.八月.test0809;/**
 * @author 候苑博
 * @date 2021/8/9 20:26
 * @description
 */

import java.util.PriorityQueue;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 候苑博
 * @ClassName: Sort
 * @description: TODO
 * @date: 2021/8/9 20:26
 */
public class LocalCache {


    private static ScheduledExecutorService swapExpiredPool
            = new ScheduledThreadPoolExecutor(10);

    private ReentrantLock lock = new ReentrantLock();

    private ConcurrentHashMap<String, Node> cache = new ConcurrentHashMap<>(1024);
    private PriorityQueue<Node> expireQueue = new PriorityQueue<>(1024);

    public LocalCache() {

        //使用默认的线程池，每5秒清除一次过期数据
        //线程池和调用频率 最好是交给调用者去设置。
        swapExpiredPool.scheduleWithFixedDelay(
                new SwapExpiredNodeWork(), 5, 5, TimeUnit.SECONDS);
    }

    public Object set(String key, Object value, long ttl) {


        long expireTime = System.currentTimeMillis() + ttl;
        Node newNode = new Node(key, value, expireTime);
        lock.lock();
        try {
            Node old = cache.put(key, newNode);
            expireQueue.add(newNode);
            //如果该key存在数据，还要从过期时间队列删除
            if (old != null) {
                expireQueue.remove(old);
                return old.value;
            }
            return null;
        } finally {
            lock.unlock();
        }

    }

    public Object get(String key) {
        Node n = cache.get(key);
        return n == null ? null : n.value;
    }

    /**
     * 删出KEY，并返回该key对应的数据
     */
    public Object remove(String key) {
        lock.lock();
        try {
            Node n = cache.remove(key);
            if (n == null) {
                return null;
            } else {
                expireQueue.remove(n);
                return n.value;
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * 删除已经过期的数据
     */
    private class SwapExpiredNodeWork implements Runnable {

        @Override
        public void run() {

            long now = System.currentTimeMillis();
            while (true) {
                lock.lock();
                try {
                    Node node = expireQueue.peek();
                    //没有数据了，或者数据都是没有过期的了
                    if (node == null || node.expireTime > now) {
                        return;
                    }
                    cache.remove(node.key);
                    expireQueue.poll();

                } finally {
                    lock.unlock();
                }
            }
        }
    }


    private static class Node implements Comparable<Node> {
        private String key;
        private Object value;
        private long expireTime;

        public Node(String key, Object value, long expireTime) {
            this.value = value;
            this.key = key;
            this.expireTime = expireTime;
        }


        /**
         * @see SwapExpiredNodeWork
         */
        @Override
        public int compareTo(Node o) {
            long r = this.expireTime - o.expireTime;
            if (r > 0) {
                return 1;
            }
            if (r < 0) {
                return -1;
            }
            return 0;
        }


    }

    public static void main(String[] args) throws InterruptedException {
/*   LocalCache l =   new  LocalCache();
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Random random = new Random();
                    String a = random.nextInt(10)+"";
                    int b = random.nextInt();
                    l.set(a,b,500);
                    System.out.println("a: "+a+"======="+"b:"+b);
                }
            }).start();
        }
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(l.get(i+""));
        }*/
    }
}
