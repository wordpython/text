package com.wordpython.nowcoder;

/**
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 *
 * 定义：F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)
 */
public class AO斐波那契数列 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
