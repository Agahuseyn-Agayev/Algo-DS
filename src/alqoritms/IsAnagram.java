package alqoritms;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Character ch = null;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
            int countElement = map.get(ch);
            if (countElement == 1) {
                map.remove(ch);
            } else {
                map.put(ch, countElement - 1);
            }
        }

        return true;
    }

}
