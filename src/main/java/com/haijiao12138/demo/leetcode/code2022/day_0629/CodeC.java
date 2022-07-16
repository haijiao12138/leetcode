package com.haijiao12138.demo.leetcode.code2022.day_0629;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CodeC
 * @Author houyuanbo
 * @Date 2022/6/29 21:04
 * @Description TODO
 * @Version
 **/
public class CodeC {
    Map<String,String> map = new HashMap<String,String>();
    static final String INDEX = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String TINYURL_PREFIX = "http://tinyurl.com/";
    public String encode(String longUrl) {
        char[] chs = new char[6];
        while (true){
            for (int i = 0; i < 6; i++) {
                chs[i] = INDEX.charAt((int) (Math.random() * 62));
            }
           String shortUrl =  TINYURL_PREFIX + new String(chs);
            if (!map.containsKey(shortUrl)){
                map.put(shortUrl,longUrl);
                return shortUrl;
            }
        }
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        return map.get(shortUrl);//键是shortUrl
    }
}
