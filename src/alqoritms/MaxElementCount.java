package alqoritms;

public class MaxElementCount {
    public static int countElement(int arr[]) {
        int max = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if (arr[i] == max) {
                count++;
            }
        }
        return count;
    }
}
