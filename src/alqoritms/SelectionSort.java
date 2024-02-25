package alqoritms;

import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_index = j;
                }
            }

            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }

        }
    }

    }

