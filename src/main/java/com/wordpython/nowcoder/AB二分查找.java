package com.wordpython.nowcoder;

import org.junit.Test;

/**
 * 请实现有重复数字的有序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 */
public class AB二分查找 {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        if(a[n-1]<v){return n+1;}//如果不存在这样的数：即数组中所有数字都比
        int Left = 0;
        int Right = n-1;
        while(Left < Right)
        {
            int Mid = Left+(Right-Left)/2;//防溢出
            if(a[Mid]>=v){Right = Mid;}
            else{Left = Mid+1;}
        }
        return Left+1;
    }

    public int upper_bound_1 (int n, int v, int[] a) {
        int left=0;
        int right=n-1;
        int t=1;//用于标记找到的位置
        if(a[right]<v) return n+1;//不存在比v大的数
        while (left<=right){
            if(v<=a[(left+right)/2]){
                t=(left+right)/2+1;
                right=(left+right)/2-1;
            }
            if(v>a[(left+right)/2]) left=(left+right)/2+1;
        }
        return t;
    }
    @Test
    public void test(){
        int[] a={1,2,4,4,5};
        System.out.println(upper_bound_(5,4,a));
    }
}
