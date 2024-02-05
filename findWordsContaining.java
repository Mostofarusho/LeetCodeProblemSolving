import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class findWordsContaining {
    public static void main(String[] args) {
        String[] words = { "abc", "bcd", "aaaa", "cbc" };
        char x = 'z';
        List<Integer> result = findPositionsOfChar(words, x);
        System.out.println(result);
    }

    static List<Integer> findPositionsOfChar(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            String word = words[wordIndex];
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == x) {
                    result.add(wordIndex);
                    break;
                }
            }
        }

        return result;
    }
}