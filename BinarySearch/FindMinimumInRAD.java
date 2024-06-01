public class FindMinimumInRAD {
    public static void main(String[] args) {
        int[] myArray = { 3, 3, 3, 1 };
        // int target=0;
        System.out.println(findMin(myArray));
    }

    static int findMin(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (myArray[mid] < myArray[end]) {
                end = mid;
            } else if (myArray[mid] > myArray[end]) {
                start = mid + 1;
            } else {
                end--;
            }
        }

        return myArray[start]; 
    }
}
