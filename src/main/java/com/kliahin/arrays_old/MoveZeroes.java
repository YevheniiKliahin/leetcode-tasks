package com.kliahin.arrays_old;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        if (nums.length < 3) {
            if (nums[0] > 0 && nums[1] > 0) return;
        };

        int insertIdx = 0;
        int count = 1;

        while (count < nums.length){
            if (nums[insertIdx] != 0){
                insertIdx++;
            }
            if (nums[insertIdx] == 0 && nums[count] != 0) {
                nums[insertIdx] = nums[count];
                nums[count] = 0;
                insertIdx++;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{0,1,0,3,12};
        int[] test2 = new int[]{0};
        int[] test3 = new int[]{2,1};
        int[] test4 = new int[]{1,2,3,1};

        moveZeroes(test1);
        moveZeroes(test2);
        moveZeroes(test3);
        moveZeroes(test4);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));
        System.out.println(Arrays.toString(test4));
    }
}
