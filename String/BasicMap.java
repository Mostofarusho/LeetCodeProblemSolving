import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicMap {

    public static void main(String[] args) {
        String word="Mostofa Omar Fattha Rusho";
        word=word.toUpperCase();
        char[] myArray=word.toCharArray();
        int i=0;
        int size=myArray.length;
        Map<Character,Integer> map=new HashMap<>();
        while (i!=size) {
            if(map.containsKey(myArray[i])==false){
                map.put(myArray[i], 1);
            }
            else{
               int oldValue= map.get(myArray[i]);
               int newValue=oldValue+1;
               map.put(myArray[i], newValue);

            }
            i++;
        }
        Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
        for (Map.Entry<Character,Integer> data:hmap) {
            System.out.print(data.getKey());
            System.out.print(data.getValue());
            System.out.println();
        }

       
    }
}