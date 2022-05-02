package com.haijiao12138.demo.leetcode.code2022.五月.day_0501;

import com.haijiao12138.demo.util.Swamp;

import java.util.Arrays;

/**
 * @ClassName No5_堆排序
 * @Author houyuanbo
 * @Date 2022/5/1 19:54
 * @Description TODO
 * @Version 构造大顶堆  然后当前根节点的堆顶元素 就是序列中的最大的元素
 *          将堆顶的元素和最后一个元素进行交换 然后将剩下的节点 重新构造成一个大顶堆，交换后的大元素的书序保持不变 继续交换剩下后的元素的顺序
 *          直到剩下最后一个元素
 **/
public class No5_堆排序 {
    public static void main(String[] args) {
        int[] arr  = {16,5,4,7,25,1,86,45};

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        for (int i = (arr.length-1)/2; i >=0 ; i--) {
            adjustHeap(arr,i,arr.length);//找到所有的非叶子节点 进行大小关系的调整 一次调整后  最大的元素就在根顶的位置  大顶堆构成
        }
        //调整堆结构  交换顶元素和末尾元素
        for (int i = arr.length-1; i > 0; i--) {
            Swamp.swapArr(arr,i,0);//交换堆顶和末尾元素的位置
            //交换完毕之后 继续进行大顶堆的调整
            adjustHeap(arr,0,i);//每次循环 减少一个元素  因为那个元素在交换之后 就放在了最终的位置上
        }
    }

    public static void adjustHeap(int[] arr,int parent,int length){
        //将temp作为父节点
        int temp = arr[parent];
        //左孩子
        int lChild = 2*parent + 1;
        while (lChild < length){//证明做孩子存在的情况下
            //右孩子
            int rChild = lChild + 1;
            //如果有右孩子节点 并且右孩子节点的值大于做孩子节点   则取右孩子节点
            if (rChild < length && arr[lChild]< arr[rChild]){
                lChild++;//左孩子节点加1  就是右孩子节点
            }
            //如果父节点的值 如果已经大于孩子节点的值  则直接结束 （因为上面选取了lChild的索引的值  所以 直接拿该索引判断即可）
            if (temp >= arr[lChild]){
                break;
            }
            //把孩子节点的值 赋值给父节点
            arr[parent] = arr[lChild];
            //选取孩子节点的左孩子节点 继续向下筛选
            parent = lChild;
            lChild = 2*lChild + 1;
        }
        arr[parent] = temp;
    }

}
