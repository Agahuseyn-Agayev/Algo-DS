package alqoritms;

public class SquaresSort {
    public static int[] squaresSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int n = arr.length;
        int[] result = new int[n];
        int index = right;
        while (left != right) {
            if (Math.abs(arr[right]) > Math.abs(arr[left])) {
                result[index] = arr[right] * arr[right];
                right--;
            } else {
                result[index] = arr[left] * arr[left];
                left++;
            }
            index--;
        }
        result[index] = arr[right] * arr[right];
        return result;
    }
}
