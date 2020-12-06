package com.wordpython.leetbook;
/*
总结：
    非静态方法可以直接调用本类及父类中静态和非静态方法，
    静态方法只能调用本来及父类中静态方法。
 */
public class 方法调用题型 extends Father{
    public void aa(){
        System.out.println("子类方法aa");
    }
    public static void bb(){
        System.out.println("子类方法bb");
    }
    public void c(){
        a();
        aa();
        b();
        bb();
    }
    public static void d(){
        b();
        bb();
    }


}
