package com.logical.logicalservice.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeServices {

    public String findHighestPalindrome(String str, int k) {
        char[] chars = str.toCharArray();
        return findPalindrome(chars, 0, chars.length - 1, k);
    }

    public String findPalindrome(char[] chars, int left, int right, int k) {
        if (left >= right) {
            return new String(chars);
        }

        if (chars[left] != chars[right]) {
            char maxChar = (char) Math.max(chars[left], chars[right]);
            chars[left] = maxChar;
            chars[right] = maxChar;
            k--;

            if (k < 0) {
                return "-1";
            }
        }

        return findPalindrome(chars, left + 1, right - 1, k);
    }

}
