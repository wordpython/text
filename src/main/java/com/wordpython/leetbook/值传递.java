package com.wordpython.leetbook;

public class 值传递 {
    private static void change(StringBuffer str11, StringBuffer str12) {
        str12 = str11;
        str11 = new StringBuffer("new world");
        str12.append("new world");
    }
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("good ");
        StringBuffer str2 = new StringBuffer("bad ");
        change(str1, str2);
        System.out.println(str1.toString());
        System.out.println(str2.toString());
    }
}
