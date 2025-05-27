
import java.util.LinkedHashMap;
import java.util.Map;

public class AStringHasAllUniqueCharacters {
    public static void main(String[] args) {
        String givenString="SILLYSPIDERS";
        char[] ch=givenString.toCharArray();
        int size=ch.length;
        Map<Character,Integer> map=new LinkedHashMap<>();
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
            if(data.getValue()>1){
                System.out.println("Does not contain All Unique Characters ");
                System.exit(0);
            }
            
        }
        System.out.println("Does contain All Unique Characters ");
    } 
}
