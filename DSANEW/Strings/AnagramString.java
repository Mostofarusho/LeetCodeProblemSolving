
import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String firstString="ARADHYA is he";
        char[] firstChar=firstString.replaceAll("//s", "").toUpperCase().toCharArray();
        Arrays.sort(firstChar);
        String secondString="HRADAYA HE IS";
        char[] secondChar=secondString.replaceAll("//s", "").toUpperCase().toCharArray();
        Arrays.sort(secondChar);
        Boolean result=Arrays.equals(firstChar, secondChar);
        if(result){
            System.out.println("This is an Anagram String");
        }
        else{
            System.out.println("This is not an Anagram");
        }
        // int size=firstChar.length;
        // int i=0;
        // while (i!=size) { 
        //     if(firstChar[i]==secondChar[i]){
        //         i++;
        //     }
        //     else{
        //         System.out.println("This is not an Anagram");
        //         System.exit(0);
        //     }
        // }
        // System.out.println("This is an Anagram String");

    }
}
