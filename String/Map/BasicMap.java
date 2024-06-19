package String.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicMap {

    public static void main(String[] args) {
        String input = "ARADHYA";
        char ch[] = input.toCharArray();
        int i = 0;
        int size = ch.length;
        Map<Character, Integer> map = new HashMap<>();
        while (i != size) {
            if (map.containsKey(ch[i]) == false) {
                map.put(ch[i], 1);
            } else {
                int oldVal = map.get(ch[i]);
                int newVal = oldVal + 1;
                map.put(ch[i], newVal);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character, Integer> data : hmap) {
            System.out.print(data.getKey());
            System.out.print(data.getValue());
        }
    }
}