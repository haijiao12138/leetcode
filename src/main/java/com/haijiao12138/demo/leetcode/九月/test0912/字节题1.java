package com.haijiao12138.demo.leetcode.九月.test0912;

import java.util.Arrays;

/**
 * @author: haijiao12138
 * @ClassName: 字节题1
 * @description: TODO
 * @date: 2021/9/12 10:08
 */
public class 字节题1 {
    public static void main(String[] args) {

        int[][] arr = {
                {1,3,5,6},
                {1,1,5,7},
                {2,1,5,6}
        };
        Arrays.sort(arr, (o1, o2) -> (o1[0] - o2[0]!=0) ?o1[0]-o2[0] :o1[1]-o2[1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }

    public static void test(){
        int[] a = {1,2,7,4,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int[][] arr = new int[n][2];
//    for (int i = 0; i < n; i++) {
//        arr[i][0] = scanner.nextInt();
//        arr[i][1] = scanner.nextInt() + arr[i][0]-1;
//    }
//    test(n,arr);
//
//}
//
//    public static void test(int n,int[][] arr){
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]){
//                    return o1[1] - o2[1];
//                }
//                return o1[0] - o2[0];
//            }
//        });
//        int max = Integer.MIN_VALUE;
//        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            int time = arr[i][0];
//            temp++;
//            for(int j = 0;j<i;j++) {
//                if (arr[j][0]!= -1 && time > arr[j][1] && temp > 0) {
//                    temp--;
//                    arr[j][0] = -1;
//                }
//            }
//            max = Math.max(temp,max);
//        }
//        System.out.println(max);
//    }



}
