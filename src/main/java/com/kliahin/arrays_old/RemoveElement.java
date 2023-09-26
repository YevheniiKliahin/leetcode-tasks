package com.kliahin.arrays_old;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3, 2, 2, 3}; int val1 = 3;
        int[] test2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2}; int val2 = 2;

        System.out.println(removeElement(test1, val1));
        System.out.println(Arrays.toString(test1));
        System.out.println(removeElement(test2, val2));
        System.out.println(Arrays.toString(test2));
    }
}
