package com.wordpython.leetbook;

import java.util.HashMap;
import java.util.Map;

/**
 * 给一个数组和目标数target，找出数组中是否有两数和为target
 *
 */
public class TwoSum {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(hashMap.containsKey(target-numbers[i])){
                return new int[]{hashMap.get(target-numbers[i]),i+1};
            }
            hashMap.put(numbers[i], i+1);
        }
        return null;
    }
}
