package com.company;

public class Palindrome {

    /**
     * Function that checks and prints if given string is Palindrome or not
     * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward
     *
     * @param1 originalWord:variable used for storing word that is used for palindrome checking
     * @param2 reversedWord:variable used for storing reversed originalWord
     */
    public void checkPalindrome(String originalWord) {
        originalWord = originalWord.toLowerCase();
        String reversedWord = "";
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + originalWord.charAt(i);
        }
        if (originalWord.equals(reversedWord)) {
            System.out.println("Yes, word is palindrome!");
        } else {
            System.out.println("No, word isn't palindrome");
        }
    }
}
