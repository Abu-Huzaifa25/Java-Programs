# Leetcode Easy Assignment 1

Given an array `nums` and an integer `target`, return indices of two numbers summing to `target`. One solution exists, and elements can't be reused.

## Examples
**Input:** nums = [2,7,11,15], target = 9  
**Output:** [0,1]

**Input:** nums = [3,2,4], target = 6  
**Output:** [1,2]

**Input:** nums = [3,3], target = 6  
**Output:** [0,1]

## Constraints
- 2 ≤ nums.length ≤ 10⁴
- -10⁹ ≤ nums[i], target ≤ 10⁹

## Solution

### Brute Force
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
```
**Time:** O(n²), **Space:** O(1)

### Optimized (HashMap)
```java
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
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
```
**Time:** O(n), **Space:** O(n)

---

# Leetcode Easy Assignment 2

## Palindrome Number
Given an integer `x`, return `true` if `x` is a palindrome.

### Examples
**Input:** x = 121  
**Output:** true

**Input:** x = -121  
**Output:** false

**Input:** x = 10  
**Output:** false

## Constraints
- -2³¹ ≤ x ≤ 2³¹ - 1

## Solution
```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x, reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed == original;
    }
}
```
**Time:** O(n), **Space:** O(1)

