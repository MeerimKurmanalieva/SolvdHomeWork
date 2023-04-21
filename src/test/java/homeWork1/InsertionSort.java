package homeWork1;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;




    }
}public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 3, 1, 6 };
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 6, 8]

    }
}