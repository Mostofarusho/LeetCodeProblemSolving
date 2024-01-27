import java.util.Arrays;

public class sortingthesentence {
    public static void main(String[] args) {
        String input = "is2 sentence4 This1 a3";
        String[] result = sortSentence(input);
        System.out.println(String.join(" ", result));
    }

    static String[] sortSentence(String s) {
        String[] words = s.split(" ");
        int size = words.length;
        String[] result = new String[size];

        for (String word : words) {
            String actualWord = word.substring(0, word.length() - 1);
            int position = Character.getNumericValue(word.charAt(word.length() - 1));
            result[position - 1] = actualWord;
        }

        return result;
    }
}
