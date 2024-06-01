public class FindMinimumInRA {
    public static void main(String[] args) {
        int[] myArray = { 1,3,3 };

        System.out.println(findMin(myArray));
    }

    static int findMin(int[] myArray) {
        int pivot = findPivot(myArray);
        
        if (pivot == -1) {
            return myArray[0];
        }
        return myArray[pivot];
    }

    static int findPivot(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && myArray[mid] > myArray[mid + 1]) {
                return mid + 1;

            }
            if (mid > start && myArray[mid - 1] > myArray[mid]) {
                return mid;

            }
            if (myArray[start] <= myArray[mid]) {
                start = mid + 1;
            }
            // //myArray[start] >myArray[mid]
            else {
                end = mid;
            }

        }
        return -1;
    }

}