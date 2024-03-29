package alqoritms;

public class IsPalindromeInt {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int temp = x % 10;
            reversed = reversed * 10 + temp;
            x /= 10;
        }
        return original == reversed;
    }
}
