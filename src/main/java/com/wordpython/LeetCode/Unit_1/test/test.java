package com.wordpython.LeetCode.Unit_1.test;

/**
 * @Author wordpython
 * @Date 2019/11/21
 **/

public class test {
    int a;
    public test(int a){
        this.a=a;
    }
}
class aa{
    public static void main(String[] args) {
        test x=new test(10);
        test y=x;
        System.out.println(y.a);
        System.out.println("--------");
        y.a=11;
        System.out.println(x.a);

        System.out.println("!--------");
        int i=1;
        int ii=i;
        System.out.println(ii);
        i=2;
        System.out.println(ii);
    }
}
