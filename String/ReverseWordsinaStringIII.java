import java.util.Arrays;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);

    }

    public static String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        result.append(sb).append(" ");
        
    }
    result.setLength(result.length()-1);
    return result.toString();
}
    // char[] letters = word.toCharArray();
    // // int i=0;
    // int size = letters.length;
    // char[] newChar = new char[size];
    // for (int i = size - 1; i > 0; i--) {
    // newChar[i] = letters[i];
    // }
    // return Character.toString(newChar);
    // }

}
