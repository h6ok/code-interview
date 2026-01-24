package com.codeinterview.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 */
public class TwoSum {

    public static int[] Solution(int[] nums, int target) {

        Map<Integer, Integer> numAndIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numAndIndexMap.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];

            if (numAndIndexMap.get(diff) != null && numAndIndexMap.get(diff) != j) {
                return new int[] { j, numAndIndexMap.get(diff) };
            }
        }

        return new int[0];
    }
}
