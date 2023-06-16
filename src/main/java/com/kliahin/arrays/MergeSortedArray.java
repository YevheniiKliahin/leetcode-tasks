package com.kliahin.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if(m == 0){
            if(n != 0) {
                if (nums1.length >= nums2.length){
                    for(int i = 0; i < nums2.length; i++){
                        nums1[i] = nums2[i];
                    }
                }
                return;
            }
        }

        int counter = nums1.length - 2;
        int maxIdx1 = m-1;
        int maxIdx2 = n-1;

        while(maxIdx2 >= 0) {
            if(nums2[maxIdx2] > nums1[maxIdx1]){
                nums1[counter+1] = nums2[maxIdx2];
                maxIdx2--;
            } else if(nums2[maxIdx2] == nums1[maxIdx1]){
                nums1[counter+1] = nums2[maxIdx2];
                nums1[counter] = nums1[maxIdx1];
                maxIdx2--;
                maxIdx1--;
            } else if (nums2[maxIdx2] < nums1[maxIdx1]) {
                nums1[counter+1] = nums1[maxIdx1];
                maxIdx1--;
            }
            counter--;
            }
    }

    public static void main(String[] args) {
        int[] test11 = new int[]{1,2,3,0,0,0}; int m1 = 3;
        int[] test12 = new int[]{2,5,6}; int n1 = 3;
        int[] test21 = new int[]{1}; int m2 = 1;
        int[] test22 = new int[]{}; int n2 = 0;
        int[] test31 = new int[]{0}; int m3 = 0;
        int[] test32 = new int[]{1}; int n3 = 1;

        merge(test11, m1, test12, n1);
        merge(test21, m2, test22, n2);
        merge(test31, m3, test32, n3);

        System.out.println(Arrays.toString(test11));
        System.out.println(Arrays.toString(test21));
        System.out.println(Arrays.toString(test31));
    }
}
