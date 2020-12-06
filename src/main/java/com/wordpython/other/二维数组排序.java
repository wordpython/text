package com.wordpython.other;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 二维数组排序 {
    public static void main(String[] args) {
        int[][] a={
                {1,175,0},{2,171,0},
                {3,172,1},{4,173,1},
                {5,174,0},{6,173,1},{7,168,0}
        };
        Arrays.sort(a,(x,y)->{
            if(x[2]==y[2]){
                if(x[1]==y[1]){
                    return x[0]-y[0];
                }
                return x[1]-y[1];
            }
            return x[2]-y[2];
        });
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
            System.out.println();
        }
        String  s="hello world";
        String trim = s.trim();
    }
}
