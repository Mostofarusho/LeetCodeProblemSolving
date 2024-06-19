package String;
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
               
                sb.deleteCharAt(sb.length() - 1);
                i++;
            } else {
                
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
