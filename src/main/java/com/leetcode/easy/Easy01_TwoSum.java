package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class Easy01_TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

         System.out.println(Arrays.toString(twoSum(arr, target)));
//        System.out.println(Arrays.toString(twoSumWithHashMap(arr, target)));

    }

    // 1. Solution
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // 2. Solution
    public static int[] twoSumWithHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
