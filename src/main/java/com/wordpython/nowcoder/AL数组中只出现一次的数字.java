package com.wordpython.nowcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class AL数组中只出现一次的数字 {

    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果

    //哈希实现
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], 2);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> s : hashMap.entrySet()) {
            if (s.getValue() == 1 && i == 0) {
                num1[0] = s.getKey();
                i++;
            }
            if (s.getValue() == 1 && s.getKey() != num1[0]) {
                num2[0] = s.getKey();
            }
        }
    }

    //列表
    public void FindNumsAppearOnce1(int[] array, int num1[], int num2[]) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (list.contains(array[i])) {
                // 参数是整数，表示删除指定位置的数字；
                // 参数是引用类型，表示删除第一次出现的指定元素
                list.remove(new Integer(array[i]));//否则找不到而报下标越界异常
            } else {
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }


    //位运算
    public void FindNumsAppearOnce2(int[] array, int num1[], int num2[]) {

    }
}
