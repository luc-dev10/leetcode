package com.lucio.leetcode.a_ts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1: https://leetcode.com/problems/two-sum
 * <p>
 * Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to
 * target.
 * </p>
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * </p>
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 3, 7, 19};

        System.out.println(Arrays.toString(twoSum(numbers, 7)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int rem = target - numbers[i];
            if (numberMap.containsKey(rem)) {
                return new int[]{numberMap.get(rem), i};
            }

            numberMap.put(numbers[i], i);
        }
        return null;
    }
}
