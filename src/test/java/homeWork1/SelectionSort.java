package homeWork1;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 3, 1, 6 };
SelectionSort.sort(arr);
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 6, 8]

}}