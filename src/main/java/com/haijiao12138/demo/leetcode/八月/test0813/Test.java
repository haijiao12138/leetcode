package com.haijiao12138.demo.leetcode.八月.test0813;


/**
 * @author: 候苑博
 * @ClassName: Test
 * @description: TODO 贝壳面试 牛牛字符串
 * 牛牛拿到了一只由小写字母组成的字符串 接下来 将字符串进行k次操作
 * 每次操作都会把s中ASCII最小的字母从s中删除，请返回k次操作之后的字符串s
 * 输入：caabeefa   2
 * 输出：ceef;  第一次删除所有的a   第二次删除所有的b
 * @date: 2021/8/13 20:36
 *
 */
public class Test {
    public static void main(String[] args) {
        String caabeefa = test("caabeefa", 2);
        System.out.println(caabeefa);
    }

    private static String test(String str, int k) {
        boolean temp [] = new boolean[26];
        int t =0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(!temp[aChar-'a']){
                temp[aChar-'a']=true;
                t++;
            }
            if(t==26){
                break;
            }
        }
        int i=0;
        int i1 = 0;
        for (; i1 < temp.length; i1++) {
            if(temp[i1] ){
                i++;
            }
            if(i>=k){
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if(aChar-'a'>i1){
                sb.append(aChar);
            }
        }
        return sb.toString();

    }

}
