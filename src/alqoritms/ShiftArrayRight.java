package alqoritms;

public class ShiftArrayRight {
    public static void shiftArrayRightOneElement(int arr[]) {
        if (arr.length <= 1) {
            throw new IllegalStateException("Invalid Array");
        }
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;

    }

    public static void shiftArrayKElement(int arr[], int k) {
        k = k % arr.length;
        for (int j = 0; j < k; j++) {
            for (int i = arr.length - 1; i >= k; i--) {
                int temp = arr[i];
                arr[i] = arr[i - k];
                arr[i - k] = temp;
            }
        }
    }

}
