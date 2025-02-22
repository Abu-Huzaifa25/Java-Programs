package com.leetcode.easy;

public class Easy02_Palindrome {
    public static void main(String[] args) {

        int num = 1223321;
        System.out.println(isPalindrome(num));

    }
    public static boolean isPalindrome(int x) {
        int or = Math.abs(x);
        int resverse = 0;

        while( x != 0){
            int rem = x % 10;
            resverse = resverse * 10 + rem;
            x /= 10;
        }

        return resverse == or;

    }
}
