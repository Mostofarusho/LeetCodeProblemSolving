import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ALL_UNIQUE_CHARACTERS {
    public static void main(String[] args) {
        String word = "AABBCDEEE";
        word = word.toUpperCase();
        char myArray[] = word.toCharArray();
        int i = 0;
        int size = myArray.length;
        Map<Character, Integer> map = new LinkedHashMap<>();
        while (i != size) {
            if (map.containsKey(myArray[i]) == false) {
                map.put(myArray[i], 1);
            } else {
                int oldValue = map.get(myArray[i]);
                int newValue = oldValue + 1;
                map.put(myArray[i], newValue);
            }
            i++;
        }
        String result = "";
        Set<Map.Entry<Character, Integer>> linkedMap = map.entrySet();
        for (Map.Entry<Character, Integer> data : linkedMap) {
            

                result = result + data.getKey();

            

        }

        System.out.println(result);

    }
}
