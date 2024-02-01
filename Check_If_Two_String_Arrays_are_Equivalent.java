import java.util.Arrays;

public class Check_If_Two_String_Arrays_are_Equivalent {

    public static void main(String[] args) {
        String word1[] = { "ab", "c" };
        String word2[] = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String word2[]) {
        String res1 = "";
        String res2 = "";
        for (String s : word1) {
            res1 += s;
        }
        for (String s : word2) {
            res2 += s;
        }

        

        

        return res1.equals(res2);
    }
}