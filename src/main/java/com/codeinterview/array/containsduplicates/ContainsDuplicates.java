package com.codeinterview.array.containsduplicates;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {

    public static boolean Solution(int[] nums) {
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
