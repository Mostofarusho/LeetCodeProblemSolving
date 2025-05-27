
import java.util.HashMap;
import java.util.Map;

public class IntroductionToMapDataStructure {
    public static void main(String[] args) {
        String myString="MOSTOFA";
        char[] ch=myString.toCharArray();
        int size=ch.length;
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        while (i!=size) { 
            if(map.containsKey(ch[i])==false){
                map.put(ch[i], 1);
            }
            else{
                int odlVal=map.get(ch[i]);
                int newVal=odlVal+1;
                map.put(ch[i], newVal);
            }
            i++;
        }
        for(Map.Entry<Character,Integer> data: map.entrySet()){
            System.out.print(data.getKey());
            System.out.println(data.getValue());
            
        }

    }
}
