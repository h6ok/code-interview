package com.codeinterview.array;

public class TwoPointers {

    public static boolean solution(int[] left, int[] right) {

        if (left.length == 0)
            return false;

        int leftIndex = 0;
        for (int i : right) {

            if (left[leftIndex] == i) {
                leftIndex++;
            }

            if (leftIndex == left.length) {
                return true;
            }
        }

        return false;
    }
}
