# Java Leetcode Esay Programs
### [1. Two Sum](https://leetcode.com/problems/two-sum/)
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

`Example 1:`
Input: nums = [2,7,11,15], target = 9
`Output => ` [0,1]

`Explanation:` Because nums[0] + nums[1] == 9, we return [0, 1].

`Example 2:`
Input: nums = [3,2,4], target = 6
`Output => ` [1,2]

`Example 3:`
Input: nums = [3,3], target = 6
      `Output => ` [0,1]

##### Constraints:
- 2 <= nums.length <= 104
- 109 <= nums[i] <= 109
- 109 <= target <= 109
- Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
### Solution ⮯
1. Brute Force
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
2. Optimized (HashMap)
````java
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
````
---
### [2. Palindrome Number](https://leetcode.com/problems/palindrome-number/)
Given an integer` x`, return `true` if `x` is a palindrome and `false` otherwise.

`An integer is a palindrome when it reads the same forward and backward. For example, 121 is a palindrome while 123 is not.`
`Example 1:`
Input: x = 121  
`Output => ` true  
`Explanation:` 121 reads as 121 from left to right and from right to left.

`Example 2:`
Input: x = -121  
`Output => ` false  
`Explanation:` From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

`Example 3:`
Input: x = 10  
`Output => ` false  
`Explanation:` Reads 01 from right to left. Therefore, it is not a palindrome.

##### Constraints:
- -2³¹ <= x <= 2³¹ - 1















www

