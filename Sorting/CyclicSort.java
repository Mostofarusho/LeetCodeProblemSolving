import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] myArray = { 5, 4, 3, 2, 1 };
        cyclicSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void cyclicSort(int[] myArray) {
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

    }

    static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}