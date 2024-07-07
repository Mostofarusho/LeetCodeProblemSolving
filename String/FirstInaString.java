public class FirstInaString {

    public static void main(String[] args) {
        String haystack = "sadbutsad"; String needle = "sad";
        // String haystack = "leetcode";String needle = "leeto";
        int ans=strStr(haystack, needle);
        
        System.out.println(ans);
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}