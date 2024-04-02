package ru.diana.insertion_sort_practice.main;
import java.util.Arrays;
import static ru.diana.insertion_sort_practice.service.InsertionSort.insertionSort;

public class Main {
    public static void main (String[] args) {
        String[] arr = {"practice", "sorter", "map", "insertion"};
        System.out.println(Arrays.toString(arr) + "\n");
        insertionSort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }
}
