package com.haijiao12138.demo.leetcode.code2022.day_0629;

/**
 * @ClassName 加油站问题_中等
 * @Author houyuanbo
 * @Date 2022/6/29 21:13
 * @Description TODO
 * @Version
 **/
public class 加油站问题_中等 {
    public static int canCompleteCircuit(int[] gas,int[] cost){
        int n = gas.length;//[1,2,3,4,5]
                           // 0,1,2,3,4号
        int total_tank = 0;
        int curr_tank = 0;
        int starting_station = 0;
        for (int i = 0; i < n; i++) {
            //总和必须大于等于0才能完成  在结束的时候  只有每一站 >=0才能继续往下走  一圈结束后  总的存储量必须大于总的消耗量才存在这个站
            total_tank += gas[i] - cost[i];//每一站的时候的油量
            curr_tank += gas[i] - cost[i];//每一个当前站不合适的时候 就会退出 考虑下一个站

            if (curr_tank < 0){
                //当前站小于0  那么不能作为起点
                starting_station = i+1;//考虑下一个站 作为起点
                curr_tank = 0;
            }
        }
        return total_tank >=0 ? starting_station : -1;


    }
}
