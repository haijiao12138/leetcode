package com.haijiao12138.demo.leetcode.code2022.day_0529;

/**
 * @Author:候苑博
 * @Date:2022-05-29 19:25
 * description:
 * Todo:
 */
public class 力扣_验证IP_地址 {
    public static void main(String[] args) {

    }
    public String vaalid(String IP){
        if (IP == null){
            return "Neither";
        }
        String regex0 = "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d25[0-5])";
        String regexIPv4 = regex0 + "(\\.)" + regex0 + "){3}";
        String regex1 = "([\\da-fA-F]{1,4})";
        String regexIPv6 = regex1 + "(:" + regex1 + "){7}";
        String result = "Neigther";
        if (IP.matches(regexIPv4)){
            result = "IPv4";
        }else if (IP.matches(regexIPv6)){
            result = "IPv6";
        }
        return result;
    }

}
