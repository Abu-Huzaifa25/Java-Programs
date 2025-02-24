package com.leetcode.easy;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String string = "   fly me   to   the moon  ";
        String string2 = "abcder....z aeiou";

        System.out.println(lengthOfLastWord(string));
        System.out.println(lengthOfTheLastWord(string2));


    }

    // Logic 1
    static int lengthOfLastWord(String s) {
        char ch = ' ';
        int count = 0;
        String lastWord = "";
        String [] arr = s.split(String.valueOf(ch));

        for (int i = 0; i < arr.length; i++){
            lastWord = arr[i];
        }

        for (int i = 0; i < lastWord.length(); i++){
            count++;
        }
        return count;
    }

    // Logic 2
    static int lengthOfTheLastWord(String s){
        s = s.trim();
        int end = s.length() - 1;
        int start = end;

        while( (start >= 0) && (s.charAt(start) != ' ')){
            start--;
        }
        return end - start; // 16 - start( 11, 12.... any number)
    }
}
