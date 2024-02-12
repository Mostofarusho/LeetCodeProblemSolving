import java.util.Arrays;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        char ch[] = s.toCharArray();
        int size = ch.length;
        char copy[] = new char[size];
        for (int i = size - 1; i >= 0; i--) {
            copy[i] = ch[size-i-1];
        }
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != copy[i]) {
                return false;

            }
        }
        return true;
    }
}
