package com.wordpython.nowcoder;

/**
 * 题目描述
 * 给出两个有序的整数数组 A和 B，请将数组 B合并到数组 A中，变成一个有序的数组
 * 注意：
 * 可以假设 A数组有足够的空间存放 B数组的元素， A和 B中初始的元素数目分别为 m和n
 */
public class AR合并两个有序的数组 {
    //双指针，从后往前读
    public void merge(int A[], int m, int B[], int n) {
        int a=m-1,b=n-1,p=n+m-1;
        while (b>=0){
            if(a>=0&&A[a]>B[b]){
                A[p--]=A[a--];
            }else {
                A[p--]=B[b--];
            }
        }
    }
}
