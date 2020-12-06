package com.wordpython.LeetCode.Unit_1;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author wordpython
 * @Date 2019/11/15
 **/

/**
 * <h2>1.两数之和</h2>
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    /*
    * 暴力法
    * */
    public int[] twoSum_force(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /*
    * 一遍哈希表
    * 在leetcode中执行用时: 4 ms, 在Two Sum的Java提交中击败了99.61% 的用户
     复杂度分析：
       时间复杂度：O(n)
       空间复杂度：O(n)。
     解题思路：所求的两个值，一旦有一个已经在哈希表中，那么另一个值便可在数组遍历过程中找出
    * */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    @Test
    public void test_force(){
        int nums[]=new int[4];
        nums[0]=2;
        nums[1]=7;
        nums[2]=11;
        nums[3]=15;
//        long start = System.currentTimeMillis();//计算毫秒ms
        long start = System.nanoTime();//计算纳秒ns
        System.out.println(Arrays.toString(new TwoSum().twoSum_force(nums,9)));
        long end=System.nanoTime();
        double resultTime=(end-start)/10000;
        System.out.println(resultTime/100+"ms");

        long s=System.nanoTime();
        System.out.println(new TwoSum().twoSum(nums,9));
        long e=System.nanoTime();
        double re=(e-s)/10000;
        System.out.println(re/100+"ms");
    }
}

