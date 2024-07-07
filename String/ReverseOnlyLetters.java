public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String ans = reverseOnlyLetters(s);
        System.out.println(ans);
    }

    public static String reverseOnlyLetters(String s) {
        String[] words = s.split("-");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            result.append(sb).append("-");
            // result.append(sb);

        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
}
