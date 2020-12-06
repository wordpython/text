package com.wordpython.leetbook;

import java.util.Arrays;

/*
搜索二维矩阵 II
编写一个高效的算法来搜索mxn矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
每行的元素从左到右升序排列。
每列的元素从上到下升序排列。

示例:
现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target=5，返回true。
给定target=20，返回false。

 */
public class 搜索二维矩阵II {
    //从矩阵左下角开始查找
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length-1,col=0;
        while(row>=0&&col< matrix[0].length){
            if(target>matrix[row][col]){
                col++;
            }else if(target<matrix[row][col]){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(searchMatrix(matrix,2));
    }
}
