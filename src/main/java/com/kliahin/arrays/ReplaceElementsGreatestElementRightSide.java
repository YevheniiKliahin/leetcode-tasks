package com.kliahin.arrays;

import java.util.Arrays;

public class ReplaceElementsGreatestElementRightSide {

    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i-1] < arr[i]){
                arr[i-1] = max;
            }else{
                max = arr[i-1];
            }
        }
        addSpaceToArr(arr);
        return arr;
    }

    private static void addSpaceToArr(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = -1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{17,18,5,4,6,1}; //[18,6,6,6,1,-1]
        int[] test2 = new int[]{400}; // [-1]

        System.out.println(Arrays.toString(replaceElements(test1)));
        System.out.println(Arrays.toString(replaceElements(test2)));
    }
}
