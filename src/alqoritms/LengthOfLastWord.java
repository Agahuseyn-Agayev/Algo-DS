package alqoritms;

public class LengthOfLastWord {

    public static int lengthOfString(String s) {
        int i = s.length() - 1;
        int length = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
