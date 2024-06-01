public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] myArray = { 1,2,3,4,5,6 };
        // int target=0;
        System.out.println(findPivot(myArray));
    }

    static int search(int[] myArray, int target) {
        int pivot = findPivot(myArray);
        if (pivot == -1) { 
            return BinarySearch(myArray, target, 0, myArray.length - 1);
        }
        if (myArray[pivot] == target) {
            return pivot;
        }
        if (target >= myArray[0]) {
            return BinarySearch(myArray, target, 0, pivot - 1);
        }
       
            return BinarySearch(myArray, target, pivot + 1, myArray.length - 1);
        
    }

    static int BinarySearch(int[] myArray, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > myArray[mid]) {
                start = mid + 1;
            } else if (target < myArray[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && myArray[mid] > myArray[mid + 1]) {
                return mid;
            }
            if (mid > start && myArray[mid] < myArray[mid - 1]) {
                return mid - 1;
            }
            if (myArray[mid] <= myArray[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}