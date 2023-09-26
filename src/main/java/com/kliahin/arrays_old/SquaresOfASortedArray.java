package com.kliahin.arrays_old;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{-4, -1, 0, 3, 10};
        int[] test2 = new int[]{-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(test1)));
        System.out.println(Arrays.toString(sortedSquares(test2)));
    }
}
