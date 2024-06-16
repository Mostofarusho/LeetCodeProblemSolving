import java.util.ArrayList;
import java.util.Arrays;

public class targetIndex {
    public static void main(String[] args) {
        int[] myArray = { 1,2,5,2,3};
        int target=2;
        ArrayList<Integer> targetIndices = targetIndices(myArray, target);
        System.out.println("Target indices: " + targetIndices);
    }
    
    static ArrayList<Integer> targetIndices(int[] myArray, int target) {
        BubbleSort(myArray);
        ArrayList<Integer> targetIndices = new ArrayList<>();
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==target){
                targetIndices.add(i);
            }
        }
        return targetIndices;
    }

    static void BubbleSort(int[] myArray) {
        boolean swapped = false;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < myArray.length - i; j++) {
                if (myArray[j] < myArray[j - 1]) {
                    swap(myArray, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}