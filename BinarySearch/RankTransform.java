public class RankTransform {
    public static void main(String[] args) {
        
    }
    public int[] arrayRankTransform(int[] arr) {
        BubbleSort(arr);
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
