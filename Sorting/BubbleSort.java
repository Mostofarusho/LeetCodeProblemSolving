import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = { 5, 4, 3, 2, 1 };
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void bubbleSort(int[] myArray) {
        boolean isSorted;
        for (int i = 0; i < myArray.length; i++) {
            isSorted = false;
            for (int j = 1; j <= myArray.length - i - 1; j++) {
                if (myArray[j] < myArray[j - 1]) {
                    swap(myArray, j, j-1);
                    isSorted = true;
                }
            }
            if (!isSorted) {
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