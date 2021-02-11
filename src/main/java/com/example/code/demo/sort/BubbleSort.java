package com.example.code.demo.sort;


import java.util.Arrays;

public class BubbleSort {

    /**
     * 相邻两数两两比较，使得最后一个为最大值
     * 继续从头比较，使得n-1的为最大值
     * @param nums
     * @return
     */
    public static int[] sort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i; j++) {
                swap(nums, j);
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int j) {
        if(nums[j]>nums[j+1]) {
            int a = nums[j + 1];
            nums[j + 1] = nums[j];
            nums[j] = a;
        }
    }

    public static void main(String[] args) {
        int[] sort = sort(new int[]{10, 1, 35, 20, 17, 48, 22, 31});
        System.out.println(Arrays.toString(sort));
    }

}
