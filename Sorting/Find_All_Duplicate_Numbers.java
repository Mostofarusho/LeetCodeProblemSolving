import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Find_All_Duplicate_Numbers{
    public static void main(String[] args){
        int[] myArray = { 1,1,2};
        List<Integer> ans= findDuplicates(myArray);
        System.out.println(ans);
    }
    static List<Integer> findDuplicates(int[] myArray) {
        ArrayList<Integer> duplicate=new ArrayList(); 
         int i = 0;
        while (i < myArray.length) {
            int correct = myArray[i] - 1;
            if (myArray[i] != myArray[correct]) {
                swap(myArray, i, correct);
            }
            else{
                i++;
            }
            
        }
        for(int j=0;j<myArray.length;j++){
            if(myArray[j]!=j+1){
                duplicate.add(myArray[j]);
                
            }
        }
  return duplicate;
    }
       static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}