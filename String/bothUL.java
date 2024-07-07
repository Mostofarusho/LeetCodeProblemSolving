
import java.util.HashMap;
import java.util.Map;


public class bothUL {
    public static void main(String[] args) {
        String s1 = "lEeTcOdE";
        String s2 = "arRAzFif";
        String s3 = "AbCdEfGhIjK";
        String ans1=greatestLetter(s1);
        String ans2=greatestLetter(s2);
        String ans3=greatestLetter(s3);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    public static String greatestLetter(String s) {
        char ch[]=s.toCharArray();
        
        int size=ch.length;
        Map<Character,Boolean> map=new HashMap<>();
        for(int i=0;i!=size;i++){
            map.put(ch[i], true);
        }

        String res="";
       
        for(char c='z';c>='a';c--){
            char cUpperCase=Character.toUpperCase(c);
            if(map.containsKey(c) && map.containsKey(cUpperCase)){
                res=Character.toString(cUpperCase);
                break;
            }
        }
        return res;
    }
}
