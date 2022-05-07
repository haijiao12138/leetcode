package main.java.com.haijiao12138.demo.leetcode.code2022.day_0507;

/**
 * @ClassName 力扣713_
 * @Author houyuanbo
 * @Date 2022/5/4 19:56
 * @Description TODO
 * @Version  滑动窗口
 **/
public class 力扣713_中等_ {

    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k =100;
        int i = numSubarrayProductLessThanK(nums, k);
        System.out.println(i);

    }
    // 10 1
    // 10 5  2
    // 5 2 2
    // 526 3

    public static int numSubarrayProductLessThanK(int[] nums,int k){
        int l=0,r=0,mut=nums[0];//乘机
        int ans = 0;//一共的个数
        while (r<nums.length && l<nums.length){
            //左右指针 分别标记前后位置  根据乘机的大小 去改变他的位置
            if (mut < k){
                if (++r < nums.length ){
                    mut *= nums[r];//向前移动 进行结果的更新
                }
                ans += (r - l);
            }else {
                mut /= nums[l++];
            }
        }
        return ans;
    }
}
