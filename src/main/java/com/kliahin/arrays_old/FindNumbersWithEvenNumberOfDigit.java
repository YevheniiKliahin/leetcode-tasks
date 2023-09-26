package com.kliahin.arrays_old;

public class FindNumbersWithEvenNumberOfDigit {

    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (getNumberOfDigits(num) % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    private static int getNumberOfDigits(int number) {
        int length = 0;
        while (number != 0) {
            length++;
            number = number / 10;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{12, 345, 2, 6, 7896};
        int[] test2 = new int[]{555, 901, 482, 1771};

        System.out.println(findNumbers(test1));
        System.out.println(findNumbers(test2));
    }
}
