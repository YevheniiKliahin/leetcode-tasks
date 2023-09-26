package com.kliahin.arrays_old;

import java.util.Arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                addSpaceToArr(i, arr);
            }
        }
    }

    private static void addSpaceToArr(int pos, int[] arr) {
        for (int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] test2 = new int[]{1, 2, 3};

        duplicateZeros(test1);
        duplicateZeros(test2);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
}
