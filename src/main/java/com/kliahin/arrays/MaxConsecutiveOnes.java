package com.kliahin.arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(current, max);
                current = 0;
            } else {
                current++;
            }
        }

        return Math.max(current, max);
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 1, 0, 1, 1, 1};
        int[] test2 = new int[]{1, 0, 1, 1, 0, 1};

        System.out.println(findMaxConsecutiveOnes(test1));
        System.out.println(findMaxConsecutiveOnes(test2));
    }
}
