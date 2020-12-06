package com.wordpython.nowcoder;

import org.junit.Test;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class AF跳台阶 {
    //递归
    public int JumpFloor(int target) {
        if(target==1||target==0) return 1;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
    @Test
    public void test(){
        System.out.println(JumpFloor(0));
        System.out.println(JumpFloor(1));
        System.out.println(JumpFloor(4));
    }
}
