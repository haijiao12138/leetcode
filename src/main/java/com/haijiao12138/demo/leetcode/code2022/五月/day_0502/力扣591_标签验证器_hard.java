package com.haijiao12138.demo.leetcode.code2022.五月.day_0502;

import java.util.ArrayDeque;

/**
 * @ClassName 力扣591_标签验证器_hard
 * @Author houyuanbo
 * @Date 2022/5/2 16:18
 * @Description TODO
 * @Version
 **/
public class 力扣591_标签验证器_hard {
    public static void main(String[] args) {
    String s = "<DIV>This is the first line <![CDATA[<div>]]></DIV>";
        boolean valid = isValid(s);
        System.out.println(valid);
    }

    public static boolean isValid(String code){
        int n  = code.length();
        ArrayDeque<String> tags = new ArrayDeque<>();
        int i = 0;
        while (i < n){//终止条件
            if (code.charAt(i) == '<'){
                if (i == n-1){ //如果在最后一个位置 直接返回false  因为最后一个位置只能是 >
                    return false;
                }
                if (code.charAt(i+1) == '/'){
                    //末尾结束标识符
                    int j = code.indexOf('>',i);//从i位置查找第一次出现的>的索引 位置 如果没有找到 返回-1
                    if (j < 0){
                        //没有找到
                        return  false;
                    }
                    String tagname = code.substring(i+2,j);//截取tagname
                    if (tags.isEmpty() || !tags.peek().equals(tagname)){
                        return  false;
                    }
                    tags.pop();
                    i = j+1;//继续往后遍历
                    if (tags.isEmpty() && i != n){
                        return false;
                    }
                }else if (code.charAt(i+1) == '!'){//cdata
                    if (tags.isEmpty()){
                        return  false;
                    }
                    if (i+9 > n){//<![CDATA[  是固定的
                        return false;
                    }
                    String cdata = code.substring(i+2,i+9);
                    if (!"[CDATA[".equals(cdata)){
                        return false;
                    }
                    int j = code.indexOf("]]>",i);
                    if (j < 0){
                        return false;
                    }
                    i = j+1;
                }else {
                    int j = code.indexOf('>',i);
                    if (j < 0){
                        return false;
                    }
                    String tagname = code.substring(i + 1, j);
                    if (tagname.length() < 1 || tagname.length() > 9){
                        return false;
                    }
                    for (int k = 0; k < tagname.length(); k++) {
                        if (!Character.isUpperCase(tagname.charAt(k))){
                            return false;
                        }
                    }
                    tags.push(tagname);
                    i = j+1;
                }
            }else {
                if (tags.isEmpty()){
                    return false;
                }
                i++;
            }
        }
        return tags.isEmpty();
    }
}
