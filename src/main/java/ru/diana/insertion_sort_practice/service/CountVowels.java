package ru.diana.insertion_sort_practice.service;

public class CountVowels {
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1 ) {
                count++;
            }
        }
        return count;
    }
}
