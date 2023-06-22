package com.kliahin.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> doubles = new HashMap<>();
        for(int j = 0; j < arr.length; j++){
            doubles.put(arr[j] * 2, j);
        }

        for (int i = 0; i < arr.length; i++){
            if (doubles.containsKey(arr[i]) && doubles.get(arr[i]) != i) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{10,2,5,3};
        int[] test2 = new int[]{3,1,7,11};

        System.out.println(checkIfExist(test1));
        System.out.println(checkIfExist(test2));
    }
}
