package alqoritms;

public class IsPalindromeString {
    public static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;

    }
    public static boolean isPalindromeV2(String s) {
        String empty = null;
        char ch[] = new char[s.length()];
        int i = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            ch[i] = s.charAt(j);
            i++;
        }
        empty = new String(ch);
        return empty.equals(s);
    }

}
