package alqoritms;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {


        HeapSort heapSort = new HeapSort();
        int[] arr = {40, 12, 6, 1, -1, 24, -3, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        heapSort.sort(arr);
        System.out.println("Heapified array: " + Arrays.toString(arr));
    }

    public void sort(int[] arr) {
        //heapify
        for (int i = 0; i < arr.length; i++) {
            heapify(arr, i, arr[i]);
        }
        //remove
        int last_index = arr.length - 1;
        int left = 0;
        int right;
        int parent;
        int child;
        while (last_index > 0) {
            swap(arr, 0, last_index);
            last_index--;
            parent = 0;
            while ((left = (2 * parent + 1)) <= last_index) {
                right = 2 * parent + 2;
                if (right > last_index) {
                    child = left;
                } else {
                    if (arr[left] > arr[right]) {
                        child = left;
                    } else
                        child = right;
                }
                if (arr[child] > arr[parent]) {
                    swap(arr, child, parent);
                    parent = child;
                } else break;


            }
        }
    }

    private void heapify(int[] arr, int index, int elem) {

        arr[index] = elem;
        int parent_index;
        while ((parent_index = (index - 1) / 2) != index) {
            if (arr[index] > arr[parent_index]) {
                swap(arr, index, parent_index);
            }
            index = parent_index;
        }
    }

    private void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
