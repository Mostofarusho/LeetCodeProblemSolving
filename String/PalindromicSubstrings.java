public class PalindromicSubstrings{
    public static void main(String[] args) {
        String s = "abc";
        int ans=countSubstrings(s);
        System.out.println(ans);
    }
    public static int countSubstrings(String s) {
        int i=1;
        int size=s.length();
        int multi=1;
        while (i!=size) {
            multi=i*size;
            size--;
        }
        return multi;
    }
}
