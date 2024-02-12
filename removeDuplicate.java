public class removeDuplicate {
    public static void main(String[] args) {
        String s = "abbaca";
        String ans = removeDuplicates(s);
        System.out.println(ans.toString());
    }

    static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
                // If the current character is the same as the last character in sb, remove both
                sb.deleteCharAt(sb.length() - 1);
                i++;
            } else {
                // Otherwise, add the current character to sb
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
