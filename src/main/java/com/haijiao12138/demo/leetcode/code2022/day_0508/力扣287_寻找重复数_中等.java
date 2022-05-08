package com.haijiao12138.demo.leetcode.code2022.day_0508;

/**
 * @ClassName 力扣287_寻找重复数_中等
 * @Author houyuanbo
 * @Date 2022/5/8 20:12
 * @Description TODO
 * @Version
 **/
public class 力扣287_寻找重复数_中等 {
    public static void main(String[] args) {

    }
    public static int findDuplicate(int[] nums) {
        int fast = 0,slow = 0;
        //快慢指针 找环入口
        while (true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (slow == fast){//等相碰的时候 将快指针置位0  然后快慢指针继续同步走  知道相等的时候 两个指针的位置就是 重复的位置
                fast = 0;
                while (nums[slow] != nums[fast]){
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
