package com.haijiao12138.demo.leetcode.test0806;/**
 * @author 候苑博
 * @date 2021/8/6 20:49
 * @description
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @description
 * @date 2021/8/6
 *
 */


public class Sign{
    private Map<String,Integer> map;

    public Sign(int peopleNum) {
        this.map = new HashMap<>(peopleNum);
    }

    public Sign() {
        this(16);
    }

    /**
     * 为用户名为userName的用户添加一次打卡
     * @param userName
     */
    public void sign(String userName){
        Integer integer = map.get(userName);
        if(integer == null) {
            map.put(userName, 0);
        }else{
            map.put(userName,integer+1);
        }
    }
    public  void printNotFullWorkers(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()<5){
                stringBuilder.append(entry.getKey()+",");
            }
        }
        System.out.println(stringBuilder.substring(0,stringBuilder.length() - 1));
    }

    public static void main(String[] args) {
        Sign sign = new Sign();
        sign.sign("zhangsan");
        sign.sign("zhangsan");
        sign.sign("zhangsan");
        sign.sign("zhangsan");
        sign.sign("lisi");
        sign.sign("zhangsan");
        sign.sign("wangwu");
        sign.sign("zhangsan");
        sign.sign("zhangsan");
        sign.sign("zhangsan");
        sign.printNotFullWorkers();
    }
}
