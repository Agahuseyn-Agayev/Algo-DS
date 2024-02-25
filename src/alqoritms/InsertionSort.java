package alqoritms;

import java.util.Arrays;


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {100, 20, 30, 23, 5, 27, -5, 0, 0, 0, 0, 0, 0, 2, 3, 4, 5, 6, 7, 8, 9, 200000, -8};
//        int[] arr = {20, 30, 23, 5, 27};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
                j--;
            }
        }
    }
}
