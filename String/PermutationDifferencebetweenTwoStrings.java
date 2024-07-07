import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PermutationDifferencebetweenTwoStrings {
    public static void main(String[] args) {
        String first = "abcde";
        String second = "edbac";
        int ans = findPermutationDifference(first, second);
        System.out.println(ans);

    }

    public static int findPermutationDifference(String first, String second) {
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        int i = 0;
        int j = 0;
        int size1 = firstArray.length;
        int size2 = secondArray.length;
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        while (i != size1) {
            if (map1.containsKey(firstArray[i]) == false) {
                map1.put(firstArray[i], i);
            }
            i++;
        }
        while (j != size2) {
            if (map2.containsKey(secondArray[j]) == false) {
                map2.put(secondArray[j], j);
            }
            j++;
        }

        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            int indexS = entry.getValue();
            int indexT = map2.get(key);
            sum += Math.abs(indexS - indexT);
        }

        return sum;

    }
}
