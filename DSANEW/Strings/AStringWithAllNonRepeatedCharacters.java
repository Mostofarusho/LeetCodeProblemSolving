
import java.util.LinkedHashMap;
import java.util.Map;

public class AStringWithAllNonRepeatedCharacters {
   public static void main(String[] args) {
     String myString="SPIDER_WEBS_OF_LIES";
    char[] ch=myString.toCharArray();
    int size=ch.length;
    int i=0;
    Map<Character,Integer> map=new LinkedHashMap<>();
    while(i!=size){
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
    for (Map.Entry<Character, Integer> data : map.entrySet()) {
        if(data.getValue()==1){
            System.out.print(data.getKey()+" = ");
            System.out.println(data.getValue());
        }
        
    }
   }

}
