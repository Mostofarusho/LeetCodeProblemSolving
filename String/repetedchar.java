package String;
import java.util.HashMap;

public class repetedchar {
    public static void main(String[] args) {
        char ans = repeatedCharacter("abccbaacz");
        System.out.println(ans);
    }

    static char repeatedCharacter(String s) {

        char ch = ' ';
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                ch = s.charAt(i);
                break;
            }
            map.put(s.charAt(i), i);
        }
        return ch;
    }
}
