package String;
import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        String[] words = { "abc","bcd","aaaa","cbc"};
        char x = 'z';
        int[] result = findPositionsOfChar(words, x);
        System.out.println(Arrays.toString(result));
    }

    static int[] findPositionsOfChar(String[] words, char x) {
        int[] result = new int[words.length];
        int index = 0;

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            String word = words[wordIndex];
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == x) {
                    result[index++] =wordIndex ;
                    break;
                }
            }
        }

        return Arrays.copyOf(result, index);
    }
}
