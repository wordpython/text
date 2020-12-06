package com.wordpython.nowcoder;

public class AJ子数组的最大累加和 {
    /**
     * max sum of the subarray
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray(int[] arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > 0) {
                arr[i] = arr[i - 1] + arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    /**
     * 动态规划：
     * pd(x)=pd(x-1)+f(x), pd(x-1)>0;
     * pd(x)=f(x),         pd(x-1)<=0;
     */
    public int maxsumofSubarray1(int[] arr) {
        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i] += Math.max(arr[i - 1], 0);
            res = Math.max(res, arr[i]);
        }
        return res;
    }
}
