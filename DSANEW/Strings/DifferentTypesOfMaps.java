
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DifferentTypesOfMaps  {
    public static void main(String[] args) {
        String givenString="SPIDER_WEBS_OF_LIES";
        char[] ch=givenString.toCharArray();
        int size=ch.length;
        Map<Character,Integer> map=new TreeMap<>();
        int i=0;
        while (i!=size) { 
            if(map.containsKey(ch[i])==false){
                map.put(ch[i], 1);
            }
            else{
                int oldVal=map.get(ch[i]);
                int newVal=oldVal+1;
                map.put(ch[i], newVal);
            }
            i++;
        }
        for(Map.Entry<Character,Integer> data:map.entrySet()){
            System.out.print(data.getKey()+" = ");
            System.out.println(data.getValue());
        }
    }
}
