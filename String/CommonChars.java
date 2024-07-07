import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        String[] words = { "bella", "label", "roller" };
        System.out.println(commonChars(words)); // Output: [e, l, l]
    }
    public static List<String> commonChars(String[] words) {
        char[] common = words[0].toCharArray();
        Arrays.sort(common);
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            int lp = 0, rp = 0;
            List<Character> newCommon = new ArrayList<>();
            while (lp < common.length && rp < wordChars.length) {
                if (common[lp] == wordChars[rp]) {
                    newCommon.add(common[lp]);
                    lp++;
                    rp++;
                } else {
                    if (common[lp] < wordChars[rp])
                        lp++;
                    else
                        rp++;
                }
            }
            common = new char[newCommon.size()];
            for (int i = 0; i < common.length; i++) {
                common[i] = newCommon.get(i);
            }
        }
        List<String> result = new ArrayList<>();
        for (char c : common) {
            result.add(Character.toString(c));
        }
        return result;
    }

   
}
