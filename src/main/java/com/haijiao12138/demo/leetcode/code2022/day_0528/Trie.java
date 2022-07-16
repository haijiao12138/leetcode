package com.haijiao12138.demo.leetcode.code2022.day_0528;

/**
 * @Author:候苑博
 * @Date: 2022-05-28 20:27
 * description:
 * Todo:
 */
public class Trie {
    Trie[] next;
    boolean isEnd;

    public Trie() {
    //初始化
    this.next = new Trie[26];
    this.isEnd = false;
    }

    public void insert(String word) {
        Trie cur  = this;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (cur.next[idx]==null){//若当前无此字符串  则添加
                cur.next[idx] = new Trie();
            }
            cur = cur.next[idx];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        Trie trie = searchPrefix(word);
        return trie !=null && trie.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
    private Trie searchPrefix(String prefix){
        Trie cur = this;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (cur.next[idx] == null){
                return null;//没有直接返回
            }
            cur = cur.next[idx];
        }
        return cur;
    }

}
