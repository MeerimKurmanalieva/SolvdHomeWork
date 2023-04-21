package homeWork1;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 3, 1, 6 };
    BubbleSort.sort(arr);
    System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 6, 8]
}
}

