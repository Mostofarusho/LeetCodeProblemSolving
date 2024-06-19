package String;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        // String input = "leetcode";
        // char ch[] = input.toCharArray();
        // int size = ch.length;
        // int i = 0;
        // Map<Character, Integer> map = new HashMap<>();
        // while (i != size) {
        // if (map.containsKey(ch[i]) == false) {
        // map.put(ch[i], 1);
        // } else {
        // int oldValue = map.get(ch[i]);
        // int newValue = oldValue + 1;
        // map.put(ch[i], newValue);
        // }
        // ++i;
        // }
        // Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        // for (Map.Entry<Character, Integer> data : hmap) {
        // System.out.print(data.getKey());
        // System.out.println(data.getValue());

        // }
        // Check if a String has ALL UNIQUE CHARACTERS
        String input = "leetcode";
        char ch[] = input.toCharArray();
        int size = ch.length;
        int i = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        while (i != size) {
            if (map.containsKey(ch[i]) == false) {
                map.put(ch[i], 1);
            } else {
                int oldValue = map.get(ch[i]);
                int newValue = oldValue + 1;
                map.put(ch[i], newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character, Integer> data : hmap) {
           if(data.getValue()>1){
            System.out.println("Not ALL Unique");
            System.exit(0);
           }

        }
        System.out.println("All Unique");

    }
}