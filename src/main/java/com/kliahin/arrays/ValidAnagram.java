package com.kliahin.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        return getSortedString(s).equals(getSortedString(t));
    }

    private static String getSortedString(String s) {
        return s.chars().mapToObj(c -> (char)c).sorted().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        var s1 = "anagram"; var t1 = "nagaram";
        var s2 = "rat"; var t2 = "car";

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
    }
}
