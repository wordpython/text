package com.wordpython.LeetCode.Unit_1;

/**
 * @Author wordpython
 * @Date 2019/11/27
 **/

import java.util.HashMap;

/**
 * <h2> 3.无重复字符串的最长子串 </h2>
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *  示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {
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
}