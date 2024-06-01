import java.sql.Array;
import java.util.Arrays;

public class nextGreatestLetter {

    public static void main(String[] args) {
        char[] ch = { 'c', 'f', 'j' };
        char target = 'a';
        char ans = greatestLetterNext(ch, target);
        System.out.println(ans);
    }

    static char greatestLetterNext(char[] myArray,char target){
       
        int start = 0;
        int end = myArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > myArray[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            

        }
        return myArray[start % myArray.length];
    }
}