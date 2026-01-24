package com.codeinterview.array;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 */
public class SingleNumber {

    public static int Solution(int[] nums) {

        int result = 0;
        for (int i : nums) {
            result ^= i;
        }

        return result;
    }
}
