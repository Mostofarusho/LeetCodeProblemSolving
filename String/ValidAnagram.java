import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    public static boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        char first[]=s.toCharArray();
        char second[]=t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if(Arrays.equals(first, second)){
            return true;
        }
        return false;
    }

}