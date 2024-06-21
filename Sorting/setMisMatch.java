import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class setMisMatch{
    public static void main(String[] args){
        int[] myArray = {1,1};
        int[] ans= findErrorNums(myArray);
        System.out.println(Arrays.toString(ans));
    }
     static int[] findErrorNums(int[] myArray) {
        int i=0;
        while(i<myArray.length){
            int correct=myArray[i]-1;
            if(myArray[correct]!=myArray[i]){
                swap(myArray,i,correct);
            }
            else{
                i++;
            }
        }
        int[] result = new int[2];
        for(int j=0;j<myArray.length;j++){
            if(myArray[j]!=j+1){
               result[0]=myArray[j];
               result[1]=j+1;
               
            }
        }
        return result;
    }
     static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}