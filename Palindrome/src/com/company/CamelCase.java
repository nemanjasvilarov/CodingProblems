package com.company;

public class CamelCase {
    /**
     * This function gets string of words and returns number of words in given string
     *
     * @return Returns int which represents number of words
     * @param1 word:variable used for storing given word for checking
     * @param2 wordsCaseCount:variable that is used for storing number of words
     */
    public int checkCamelCase(String word) {
        int wordsCaseCount = 1;

        for (int i = 0; i < word.length(); i++) {

            if (Character.isUpperCase(word.charAt(i))) {
                wordsCaseCount++;
            }

        }
        return wordsCaseCount;
    }
}
