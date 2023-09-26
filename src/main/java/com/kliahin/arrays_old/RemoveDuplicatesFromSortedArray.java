package com.kliahin.arrays_old;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        if (nums.length > 0) result += 1;
        int count = 1;
        int uPosition = 0;

        while(count < nums.length) {
            if(nums[uPosition] == nums[count]){
                count++;
                continue;
            } else {
                nums[uPosition+1] = nums[count];
                uPosition += 1;
                result +=1;
            }
            count++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1,1,2};
        int[] test2 = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(test1));
        System.out.println(Arrays.toString(test1));
        System.out.println(removeDuplicates(test2));
        System.out.println(Arrays.toString(test2));
    }
}
