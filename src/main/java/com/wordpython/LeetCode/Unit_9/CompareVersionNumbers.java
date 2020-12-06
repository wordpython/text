package com.wordpython.LeetCode.Unit_9;

import org.junit.Test;

import java.io.Console;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author wordpython
 * @Date 2019/11/27
 **/
/*
*
* 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
* */
public class CompareVersionNumbers {

    //官方题解
    public int lengthOfLongestSubstring(String s) {
        HashMap<Object, Integer> map = new HashMap<>();
        int ans=0;
        for (int i = 0,j=0; j < s.length(); j++) {//i标记左边位置,j标记右边位置
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)),i);
            }
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }


    public int lengthOfLongestSubstring_1(String s) {
        int ok = 0;
        for (int i = 0; i < s.length(); i++) {//指定开始位置的循环
            for (int j = i + 1; j < s.length(); j++) {//指定结束位置的循环
                //结束位置和开始位置之间的循环比较
                int oo=0;
                for (int k = i; k < j; k++) {
                    if (s.charAt(j) == s.charAt(k)) {
                        oo = 10;
                        k=j;
                    }
                }
                if (10 != oo && ok < j - i + 1) {
                    ok = j - i + 1;
                }

                if(10==oo){
                    j=s.length();
                }
            }
        }
        if(s.length()==1){
            System.out.println(1);
            return 1;
        }
        return ok;
    }

    @Test
    public void test() {
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("abcabccc"));
        System.out.println(lengthOfLongestSubstring("bb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
