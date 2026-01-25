package com.codeinterview.array;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where
 * k is non-negative.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 */
public class RotateArray {

    public static void solution(int[] nums, int k) {
        int[] temp = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < temp.length; i++) {

            int moveTo = (i + k) % temp.length;
            nums[moveTo] = temp[i];
        }
    }
}
