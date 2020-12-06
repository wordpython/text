package com.wordpython.leetbook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
多数元素
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于⌊ n/2 ⌋的元素。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
示例1:
输入: [3,2,3]
输出: 3

示例2:
输入: [2,2,1,1,1,2,2]
输出: 2

 */
public class 多数元素 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int a=1;
        int b=nums[0];
        for(Integer key : map.keySet()){
            if(map.get(key)>=a){
                a=map.get(key);
                b=key;
            }
        }
        return b;
    }

    /*
    方法二：排序
    思路,题目说多数题目是出现次数大于⌊ n/2 ⌋的元素，如果将数组 nums 中的
    所有元素按照单调递增或单调递减的顺序排序，那么下标为 n/2的元素（下标从 0 开始）一定是众数。
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] nums={3,2,3},nums1={2,2,1,1,1,2,2};
        System.out.println(new 多数元素().majorityElement1(nums1));
    }
}
