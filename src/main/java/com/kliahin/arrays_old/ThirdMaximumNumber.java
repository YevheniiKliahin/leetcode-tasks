package com.kliahin.arrays_old;

import java.util.Arrays;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length < 3) return Math.max(nums[0], nums[1]);

        Arrays.sort(nums);

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num: nums) {
            if(num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax){
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax){
                thirdMax = num;
            }
        }

        if (thirdMax == Long.MIN_VALUE) return (int)firstMax;
        return (int)thirdMax;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3,2,1};
        int[] test2 = new int[]{1,2};
        int[] test3 = new int[]{2,2,3,1};
        int[] test4 = new int[]{5,2,2};
        int[] test5 = new int[]{1,2,-2147483648};

        System.out.println(thirdMax(test1));
        System.out.println(thirdMax(test2));
        System.out.println(thirdMax(test3));
        System.out.println(thirdMax(test4));
        System.out.println(thirdMax(test5));
    }
}
