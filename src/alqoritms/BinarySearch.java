package alqoritms;

public class BinarySearch {
    public static void main(String[] args) {

    }
    public static int binarySearch(int arr[], int target) {
        int first = 0;
        int last = arr.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (arr[middle] < target) {
                first = middle + 1;
            } else if (arr[middle] == target) {
                return middle;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }
}
