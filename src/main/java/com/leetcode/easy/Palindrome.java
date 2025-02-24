package com.leetcode.easy;

public class Palindrome {
    public static void main(String[] args) {

        int num = 1223321;
        String str = "Malayalama"; // true

//        System.out.println(isPalindrome(num));
        System.out.println(isStringPalindrome(str));
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


    // Function to check if a string is a palindrome
    public static boolean isStrPalindrome(String str) {
        // Iterate over the first half of the string
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {

            // If characters at symmetric positions are not equal

            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false; // Not a palindrome
            }
        }
        return true; // It is a palindrome
    }

    public static boolean isStringPalindrome(String stringArr ){


        String originalArr = stringArr.toLowerCase();
        String reverse = "";
        char ch ;

        for (int i = 0; i < originalArr.length(); i++){
            ch = originalArr.charAt(i);
            reverse = ch + reverse ;

            if ( originalArr.equals(reverse)) return true;

        }

        return false;
    }


}
