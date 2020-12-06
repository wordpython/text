package com.wordpython.nowcoder;

import org.junit.Test;

/**
 * 题目描述
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 */
public class AT进制转换 {
    /**
     * 进制转换
     *
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public String solve(int M, int N) {
        StringBuilder stringBuilder = new StringBuilder();
        int t=M;
        while (M != 0) {
            //绝对值  Math.abs(M%N)
            switch (M%N<0?-M%N:M%N) {
                case 10:
                    stringBuilder.insert(0, "A");//求余
                    break;
                case 11:
                    stringBuilder.insert(0, "B");//求余
                    break;
                case 12:
                    stringBuilder.insert(0, "C");//求余
                    break;
                case 13:
                    stringBuilder.insert(0, "D");//求余
                    break;
                case 14:
                    stringBuilder.insert(0, "E");//求余
                    break;
                case 15:
                    stringBuilder.insert(0, "F");//求余
                    break;
                default:
                        stringBuilder.insert(0, M%N<0?-M%N:M%N);//求余
            }
            M = M / N;//整除
        }
        if(t<0) {
            stringBuilder.insert(0,"-");
        }
        return stringBuilder.toString();
    }

    @Test
    public void test() {
        System.out.println(solve(-100000000,16));
        System.out.println(solve(-4, 3));
    }
}
