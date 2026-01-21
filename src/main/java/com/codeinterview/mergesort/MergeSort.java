package com.codeinterview.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static int[] Solution(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int[] left = Solution(Arrays.copyOfRange(arr, 0, arr.length / 2));
        int[] right = Solution(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

        int capacity = left.length + right.length;
        int[] mergedArray = new int[capacity];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < capacity; i++) {
            if (leftIndex == left.length) {
                mergedArray[i] = right[rightIndex];
                rightIndex++;
                continue;
            }

            if (rightIndex == right.length) {
                mergedArray[i] = left[leftIndex];
                leftIndex++;
                continue;
            }

            if (left[leftIndex] < right[rightIndex]) {
                mergedArray[i] = left[leftIndex];
                leftIndex++;
            } else {
                mergedArray[i] = right[rightIndex];
                rightIndex++;
            }
        }

        return mergedArray;
    }

}
