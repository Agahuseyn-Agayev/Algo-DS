package alqoritms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void sumIndex(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
            int element = arr[i];
            int result = target - element;
            Integer j = map.get(result);
            while (j != null) {
                System.out.println(j);
                System.out.println(i);
                return;
            }
        }

    }

}
