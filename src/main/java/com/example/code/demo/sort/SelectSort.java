package com.example.code.demo.sort;


import java.util.Arrays;

public class SelectSort {

    /**
     * 找出一个最小值，与第0位交换位置；
     * 找出第i小的值，与第i-1位交换位置
     */
    public static int[] sort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            // 最小值下标
            int min = i;
            // 找出0到n-i的最小值
            for (int j = i; j < nums.length; j++) {
                if(nums[min]>nums[j]){
                    min = j;
                }
            }
            // swap min和i
            if(i!=min) {
                int tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] sort = sort(new int[]{10, 1, 35, 20, 17, 48, 22, 31});
        System.out.println(Arrays.toString(sort));
    }

}
