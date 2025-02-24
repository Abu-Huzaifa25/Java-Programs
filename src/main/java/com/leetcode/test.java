package com.leetcode;

public class test {
    public static void main(String[] args) {
        System.out.println("بِسْمِ ٱللَّٰهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ");




        String stringArr = "malayalamA";

        String originalArr = stringArr.toLowerCase();

        String reverse = "";
        char ch ;

        for (int i = 0; i < originalArr.length(); i++){
                ch = originalArr.charAt(i);
                reverse = ch + reverse ;

        }
        System.out.println(reverse);
        System.out.println(originalArr);

    }
}