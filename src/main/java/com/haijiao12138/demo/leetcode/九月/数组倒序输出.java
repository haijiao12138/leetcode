package com.haijiao12138.demo.leetcode.九月;

/**
 * @author: haijiao12138
 * @ClassName: 数组倒序输出
 * @description: TODO
 * @date: 2021/9/12 16:40
 */
public class 数组倒序输出 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //随机数组
        for(int i=0;i<arr.length;i++) {
            arr[i]=(int)(Math.random()*20);
        }
        System.out.print("随机数组");
        displayArray(arr);
        System.out.print("\n 转序后数组");
        displayArray(reverse(arr));

    }
    //转序方法
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            result[j]=list[i];
        }
        return result;
    }
    //打印数组元素
    public static void displayArray(int[] bb) {
        for(int a : bb) {
            System.out.print(a+",");
        }
    }

}
