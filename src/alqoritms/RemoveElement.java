package alqoritms;

public class RemoveElement {
    public static int removeElement(int[] arr, int val) {
        int validCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[validCount] = arr[i];

                validCount++;
            }
        }

        return validCount;

    }
}
