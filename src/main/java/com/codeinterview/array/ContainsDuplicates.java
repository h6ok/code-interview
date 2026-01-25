package com.codeinterview.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 */
public class ContainsDuplicates {

    public static boolean solution(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : nums) {
            if (countMap.get(i) != null) {
                return true;
            }

            countMap.put(i, 1);
        }
        return false;
    }
}
