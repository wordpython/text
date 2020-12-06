package com.wordpython.nowcoder;

import org.junit.Test;

/**
 * 题目描述
 * 实现函数 int sqrt(int x).
 * 计算并返回x的平方根
 */
public class AK求平方根 {
    /**
     *
     * @param x int整型
     * @return int整型
     */
    public int sqrt (int x) {
        //二分查找
        int left=1,right=x;
        if(x<=0) return 0;
        while (left<right){
            int middle=left+(right-left)/2;//防止溢出
            if(middle<=x/middle && (middle+1)>x/(middle+1)) return middle;
            if(middle<x/middle) left=middle;
            else right=middle;
        }
        return 1;
    }
    @Test
    public void test(){
        System.out.println(sqrt(1518991037));
        System.out.println(1424054097*1424054097);
    }
}
