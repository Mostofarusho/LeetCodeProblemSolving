import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class firstUnique {

    public static void main(String[] args) {
        int ans = firstUniqChar("loveleetcode");
        System.out.println(ans);
    }

    static int firstUniqChar(String s) {
        char ch[] = s.toCharArray();
        int size = ch.length;
        int i = 0;
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        while (i != size) {
            if (map.containsKey(ch[i]) == false) {
                map.put(ch[i], i);
            } else {

                map.put(ch[i], -1);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> LinkedMap = map.entrySet();
        for (Map.Entry<Character, Integer> data : LinkedMap) {
            if (data.getValue() != -1) {
                return data.getValue();
            }
        }
        return -1;
    }

}