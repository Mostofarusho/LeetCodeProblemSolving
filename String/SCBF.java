package String;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SCBF {
    public static void main(String[] args) {
        String s = "tree";
        char ch[] = s.toCharArray();
        int size = ch.length;
        int i = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

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
        char maxKey=' ';
        int maxValue=0;
        Set<Map.Entry<Character, Integer>> LinkedMap = map.entrySet();
        for (Map.Entry<Character, Integer> data : LinkedMap) {
           
            System.out.print(data.getKey());
           
           

        }

    }
}