package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.*;

/**
 * @author: haijiao12138
 * @ClassName: MetApp
 * @description: TODO
 * @date: 2021/9/12 14:28
 */
public class MetApp4 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,44,44,5};
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i : arr) {
//            hashSet.add(i);
//        }
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (Integer integer : hashSet) {
//           map.put(integer)
//        }

        int[] arr0 = {1,4,3,2,2,5,6};
        int[] arr1 = new int[arr0.length];
        int k = 0;
        for (int i : arr0) {
            arr1[k++] = i;
        }
        Arrays.sort(arr1);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            list.add(i);
        }
        int[] arr3=new int[arr1.length];
        //从大到小排序
        List<Integer> list1 = new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            list1.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            arr3[i] = list1.get(i);
        };
        System.out.println();
        System.out.println("从大到小排序：");
        for (int i : arr3) {
            System.out.print(i+" ");
        }
        int[] arr4 = new int[arr0.length];
        for (int i = 0; i < arr0.length; i++) {
            int temp  = arr0[i];
            for (int j = 0; j < arr3.length; j++) {
                if (arr3[j] == temp){
                    arr4[i] = j+6;
                }
            }
        }
        System.out.println();
        System.out.println("结果：");
        for (int i : arr4) {
            System.out.print(i+" ");
        }


    }
    public static int test2(int x){
        int y = x+8;
        int m = (int)Math.ceil(4522/y)+1;
        return  m;
    }
    public static int[] test3(int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0){
                list.add(i);
            }
        }
        if (list.size()>5){
            int temp = 0;
            int[] arr = new int[5];
            List<Integer> list1 = new ArrayList<>();
            for (int i = list.size()-1,j=0; i >0 ; i--) {
                list1.add(list.get(i));
                temp++;
                if (temp == 5){
                    i = 0;
                }
            }
            for (int i = 0; i < list1.size(); i++) {
                arr[i] = list1.get(i);
            };
            return arr;
        }else {
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }
    public static int[] test3(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        if (n > 7){
            for (int i = 0; i < 7; i++) {
                stack.push(arr[i]);//前五个入栈
            }
        }else {
            for (int i = 0; i < n; i++) {
                stack.push(arr[i]);
            }
        }
        int temp= 0;
        while (!stack.isEmpty() && temp!=2){
            Integer pop = stack.pop();
            temp++;
        }
        int size = stack.size();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = stack.pop();
        }
        return  a;

    }

    public static int[] test34(int[] arr){
    int[] arr1 = {1,2,2,3,4,5,6};
    Arrays.sort(arr1);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            list.add(i);
        }
    int[] arr3=new int[arr1.length];
    //从大到小排序
        List<Integer> list1 = new ArrayList<>();
        for (int i = list.size()-1,j=0; i >0 ; i--) {
            list1.add(list.get(i));

        }
        for (int i = 0; i < list1.size(); i++) {
            arr3[i] = list1.get(i);
        };
        for (int i : arr3) {
            System.out.print(i+" ");
        }

//    int k = 0;
//        for (int i : arr1) {
//            arr3[k++]= i;
//        }
//    Arrays.sort(arr3);
//      int[] arr2 = new int[arr1.length];
//        for (int i = 0,j=0; i < arr3.length; i++) {
//            if (arr2[i] == arr1[j]){
//                a
//            }
//        }
    return  arr;
    }


    public static int test1(int x){
        int y = x*7;
        return  y;
    }
    public static int[] test33(int x){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0){
                list.add(i);
            }
        }
        System.out.println(list);
        if (list.size()>6){
            int temp = 0;
            int[] arr = new int[6];
            List<Integer> list1 = new ArrayList<>();
            for (int i = list.size()-1,j=0; i >0 ; i--) {
                list1.add(list.get(i));
                temp++;
                if (temp == 6){
                    i = 0;
                }

            }
            System.out.println(list1);
            for (int i = 0; i < list1.size(); i++) {
                arr[i] = list1.get(i);
            };
            return arr;
        }else {
            int[] arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }
}
