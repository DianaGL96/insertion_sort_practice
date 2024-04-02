package ru.diana.insertion_sort_practice.service;
import java.util.Arrays;
import static ru.diana.insertion_sort_practice.service.CountVowels.countVowels;

public class InsertionSort {
    public static void insertionSort (String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String swap = arr[i];
            int vowelsCountSwap = countVowels(swap);
            int j;
            for (j = i; j > 0 && vowelsCountSwap < countVowels(arr[j-1]); j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = swap;
            System.out.println(Arrays.toString(arr));
        }
    }
}
