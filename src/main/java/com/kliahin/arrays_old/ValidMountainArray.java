package com.kliahin.arrays_old;

public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        //if size is < 2 then it not mountain
        if (arr.length < 3) return false;


        int topIdx = 0;
        int top = 0;

        //find max value and that index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > top) {
                top = arr[i];
                topIdx = i;
            }
        }

        //check that one side mountain or not
        if (top == arr[arr.length - 1] || top == arr[0]) return false;

        //check proper mountain from 0 to topIdx
        int i = 0;
        while (i < topIdx) {
            if (arr[i] >= arr[i + 1]) return false;
            i++;
        }
        //check proper mountain from topIdx to arr.length-1
        while (topIdx < arr.length - 1) {
            if (arr[topIdx] <= arr[topIdx + 1]) return false;
            topIdx++;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] test1 = new int[]{2, 1};
        int[] test2 = new int[]{3, 5, 5};
        int[] test3 = new int[]{0, 3, 2, 1};
        int[] test4 = new int[]{2, 0, 2};
        int[] test5 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(validMountainArray(test1));
        System.out.println(validMountainArray(test2));
        System.out.println(validMountainArray(test3));
        System.out.println(validMountainArray(test4));
        System.out.println(validMountainArray(test5));
    }
}
