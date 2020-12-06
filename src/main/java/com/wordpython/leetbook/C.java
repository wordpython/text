package com.wordpython.leetbook;

import java.util.ArrayList;
import java.util.List;

public class C {
    static class A{}
    static class B extends A{}

    public static void main(String[] args) {
        ArrayList<A> list=new ArrayList<A>();
        list.add(new B());method1(list);
    }

    private static void method1(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
//            A a = list.get(0);//这里报错
            A a = (A)list.get(0);
        }
    }
}
