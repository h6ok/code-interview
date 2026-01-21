package com.codeinterview.array.removeduplicates;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.
 * Consider the number of unique elements in nums to be k. After removing
 * duplicates, return the number of unique elements k.
 * The first k elements of nums should contain the unique numbers in sorted
 * order. The remaining elements beyond index k - 1 can be ignored.
 */
public class RemoveDuplicates {

    public static int Solution(int[] arr) {
        int prevIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[prevIndex] != arr[i]) {
                arr[++prevIndex] = arr[i];
            }
        }
        return prevIndex + 1;
    }
}
