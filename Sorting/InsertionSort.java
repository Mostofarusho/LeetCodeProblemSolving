import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray = { 5,4,3,2,1};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void insertionSort(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (myArray[j] < myArray[j - 1]) {
                    swap(myArray, j, j - 1);
                }
                else{
                    break;
                }
            }

        }
    }

    static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}
