import java.util.Arrays;
public class Find_Duplicate_Numbers{
    public static void main(String[] args){
        int[] myArray = { 1,3,4,2,2};
        int ans= findDuplicate(myArray);
        System.out.println(ans);
    }

     static int findDuplicate(int[] myArray) {
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
                return myArray[j];
            }
        }
  return myArray[myArray.length-1];
    }
     static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }

}