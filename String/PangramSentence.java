import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean ans=checkIfPangram(sentence);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String sentence) {
        char[] myArray = sentence.toCharArray();
        int i = 0;
        int size = myArray.length;
        Map<Character, Integer> map = new HashMap<>();
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
        for(char c='a';c<='z';c++){
            if(!map.containsKey(c)){
                return false;
            }
        }
        return true;
        // Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        // for (Map.Entry<Character, Integer> data : hmap) {
        //     for(char c='a';c<='z';c++){
        //         if(data.getKey()!=c && data.getValue()<1){
        //             return false;
        //         }
        //     }
        //     // return true;
        //     // System.out.println(data.getKey());
        //     // System.out.print(data.getValue());
        // }
        // return true;

    }

}
