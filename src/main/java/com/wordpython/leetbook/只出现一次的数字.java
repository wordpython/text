package com.wordpython.leetbook;

import org.junit.Test;

/*
只出现一次的数字
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:
输入: [2,2,1]
输出: 1

示例2:
输入: [4,1,2,1,2]
输出: 4

 */
public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                return nums[i];
            }
            for(int x=i+1;x<nums.length;x++){
                if(nums[i]==0){
                    x=nums.length;
                }else if(nums[i]==nums[x]){
                    nums[x]=0;
                    x=nums.length;
                }else if(nums[i]!=nums[x]&&x==nums.length-1){
                    return nums[i];
                }
            }
        }
        return 0;
    }
    /*
    异或有交换律定理，相当于将相同的数字先异或，这样两两异或就只剩0了，
    然后0再和最后的一个数字异或得到最终值，膜拜大佬
     */
    public int singleNumber1(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];//位运算符，异或

            }
        }
        return ans;
    }
}
