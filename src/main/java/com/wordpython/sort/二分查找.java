package com.wordpython.sort;

public class 二分查找 {
    public int binarySearch(int[] nums,int key){
        int left=0,right=nums.length-1;
        while (left<=right){
            int m=(left+right)/2;
            if(nums[m]==key){
                return m;
            }else if(nums[m]>key){
                right=m-1;
            }else{
                left=m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        System.out.println(new 二分查找().binarySearch(nums,2));
    }
}
