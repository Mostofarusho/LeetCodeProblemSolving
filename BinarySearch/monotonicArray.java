public class monotonicArray {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 2, 3 };
        System.out.println(isMonotonic(myArray));
    }

    // two pointer

    static boolean isMonotonic(int[] myArray) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > myArray[i - 1]) {
                isIncreasing = true;
            } else if (myArray[i] < myArray[i - 1]) {
                isDecreasing = true;
            }
        }
        if (isIncreasing && isDecreasing) {
            return false;
        }
        return true;
    }
}
