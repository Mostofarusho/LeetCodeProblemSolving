import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = { 5, 4, 3,8,9 };
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void selectionSort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int lastIndex = myArray.length -i- 1;
            int maxIndex = getMaxIndex(myArray, 0, lastIndex);
            swap(myArray,maxIndex,lastIndex);
        }
    }

    static int getMaxIndex(int[] myArray, int start, int end) {
        int max = start;
        for (int i = start; i <=end; i++) {
            if (myArray[max] < myArray[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}
