package HomeWork1;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        sort(left);
        sort(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int nL = left.length;
        int nR = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 3, 1, 6 };

MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 5, 6, 8]

        }}
