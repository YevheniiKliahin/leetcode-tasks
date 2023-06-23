package com.kliahin.arrays;

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;

        int i = 0;
        int j = nums.length-1;

        while(j > i){
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 != 0) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] test1 = new int[]{3,1,2,4};
        int[] test2 = new int[]{0};

        sortArrayByParity(test1);
        sortArrayByParity(test2);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
}
