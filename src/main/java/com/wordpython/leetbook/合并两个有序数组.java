package com.wordpython.leetbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/*
合并两个有序数组
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
输出:[1,2,2,3,5,6]

 */
public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (m >= n) {
            for (int i = 0; i < m + n; i++) {
                if (i < n) {
                    arrayList.add(nums2[i]);
                } else {
                    arrayList.add(nums1[i - n]);
                }
            }
        } else {
            for (int i = 0; i < n + m; i++) {
                if (i < m) {
                    arrayList.add(nums1[i]);
                } else {
                    arrayList.add(nums2[i - m]);
                }
            }
        }
        Collections.sort(arrayList);
        for (int i = 0; i < n + m; i++) {
            nums1[i] = arrayList.get(i);
        }
    }

    /*
    双指针 / 从后往前

    复杂度分析
    时间复杂度 : O(n + m)。
    空间复杂度 : O(1)O(1)。
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p3 = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p3--] = nums1[p1--];
            } else {
                nums1[p3--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] nums3 = {4, 0, 0, 0, 0, 0};
        int[] nums4 = {1, 2, 3, 5, 6};
        new 合并两个有序数组().merge2(nums3, 1, nums4, 5);
    }
}
