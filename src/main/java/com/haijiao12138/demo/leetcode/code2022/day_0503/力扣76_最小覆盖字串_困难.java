package main.java.com.haijiao12138.demo.leetcode.code2022.day_0503;

/**
 * @ClassName 力扣76_最小覆盖字串_困难
 * @Author houyuanbo
 * @Date 2022/5/3 13:58
 * @Description TODO
 * @Version 滑动窗口
 **/
public class 力扣76_最小覆盖字串_困难 {
    public static void main(String[] args) {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    String s1 = minWindow(s, t);
        System.out.println(s1);
    }
    public static String minWindow(String s,String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int n = s1.length;
        int m = t1.length;
        int[] arr = new int[58];//统计字符个数
        int f = 0,w = 0,num = 0;//快慢指针 记录符合的字符个数
        String size = "";
        for (int i = 0; i < m; i++) {
            arr[t1[i]-'A']--;
        }
        for ( f = 0; f < n; f++) {
            arr[s1[f] - 'A']++;
            if (arr[s1[f] - 'A']<=0){
                num++;//记录符合目标字符的个数
            }
            if (num == m){//目标字符的个数等于t字符串的长度 开始慢指针遍历
                while (arr[s1[w] - 'A'] > 0){
                    //不是目标字符 因为目标字符都小于等于0
                    arr[s1[w]-'A']--;
                    w++;
                }
                if (""==size || size.length() > f-w +1){
                    size = s.substring(w,f+1);
                }
            }
        }
        return size;
    }
}
