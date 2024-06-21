public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] myArray = {7,8,9,11,12};
        int ans = firstMissingPositive(myArray);
        System.out.println(ans);  // Expected output: 3
    }

    static int firstMissingPositive(int[] myArray) {
        int i = 0;
        while (i < myArray.length) {
            int correct = myArray[i] - 1;
            if (myArray[i] > 0 && myArray[i] <= myArray.length && myArray[i] != myArray[correct]) {
                swap(myArray, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] != j + 1) {
                return j + 1;
            }
        }
        return myArray.length + 1;
    }

    static void swap(int[] myArray, int first, int second) {
        int temp = myArray[first];
        myArray[first] = myArray[second];
        myArray[second] = temp;
    }
}
