package com.haijiao12138.demo.leetcode.九月.test0904;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: haijiao12138
 * @ClassName: 最长连续子串
 * @description: TODO
 * @date: 2021/9/4 11:45
 */
public class 最长连续子串 {



    public static void main(String[] args) {
        String a = "iuhgbabcd";
       // StringBuffer stringBuffer = seachMaxString(a);
        Set<Object> objects = seachMaxString(a);
        Iterator<Object> iterator = objects.iterator();
        //iterator.hasNext();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

    public static Set<Object> seachMaxString(String str) {
        if (str == null) return  null;

        // 忽略大小写
        str = str.toLowerCase();
        // 找出最长连续子串
        int max = 1;  // 最大连续字符长度
        int temp = 1; // 临时变量，记录当前连续的字符的长度
        StringBuffer sb = new StringBuffer();
        Set<Object> set = new HashSet<>();
        for(int i=1; i<str.length(); i++){
            char pre = str.charAt(i-1);//前一个
            char now = str.charAt(i); //后一个
            if(now-pre==1){
                temp++;
                set.add(str.charAt(i-1));
                set.add(str.charAt(i));
            }else{
                max=(max>temp?max:temp);
                temp = 1;
                //sb.delete(0,sb.length());//清空字符串操作
                set.clear();
            }
        }
        max=(max>temp?max:temp); // 这里是为了防止输入字符串都是连续的，上述循环出来max为1不变
        return set;
    }

}
