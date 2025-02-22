# Java Leetcode Esay Programs
### [1. Two Sum](https://leetcode.com/problems/two-sum/)

- 1.1 Brute Force
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
    // [ 0, 1 ]
}
```
- 1.2 Optimized (HashMap)
````java
import java.util.HashMap;
class Solution2 {
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
### [2. Palindrome Program](https://leetcode.com/problems/palindrome-number/)

- 2.1 Palindrome Number
```java
class Solution {
    public boolean isPalindrome(int x) {
        int or = Math.abs(x);
        int resverse = 0;

        while( x != 0){
            int rem = x % 10;
            resverse = resverse * 10 + rem;
            x /= 10;
        }

        return resverse == or;

    }
    
    // 121 == true, 43334  == true, 234 == false, 23456 == 234 == false
}
```
- 2.2 Palindrome String
```java
class Solution {
    public boolean isPalindrome(int x) {
        int or = Math.abs(x);
        int resverse = 0;

        while( x != 0){
            int rem = x % 10;
            resverse = resverse * 10 + rem;
            x /= 10;
        }

        return resverse == or;

    }
    // String Palindrome =>  Original: madam  Reversed: madam , Original: moon  Reversed: noom == false level
}
```


