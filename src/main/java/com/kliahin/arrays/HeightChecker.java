package com.kliahin.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] heightMap = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            heightMap[i] = heights[i];
        }

        Arrays.sort(heights);

        for (int j = 0; j < heights.length; j++) {
            if (heights[j] != heightMap[j]) result+=1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1,1,4,2,1,3};
        int[] test2 = new int[]{5,1,2,3,4};
        int[] test3 = new int[]{1,2,3,4,5};

        System.out.println(heightChecker(test1));
        System.out.println(heightChecker(test2));
        System.out.println(heightChecker(test3));
    }
}
