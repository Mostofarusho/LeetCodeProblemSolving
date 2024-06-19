package String.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Uniquech{
    public static void main(String[] args) {
        String input="SPIDERMAN";
        char ch[]=input.toCharArray();
        int size=ch.length;
        int i=0;
        Map<Character,Integer> map=new HashMap<>();
        while (i!=size) {
            if(map.containsKey(ch[i])==false){
                map.put(ch[i], 1);
            }
            else{
                int oldVal=map.get(ch[i]);
                int newVal=oldVal+1;
                map.put(ch[i], newVal);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for(Map.Entry<Character,Integer>data:hmap){
            if(data.getValue()>1){
                System.out.println("Not Uniue");
                System.exit(0);
            }
            
        }
        System.out.println("All Unique");
    }
}