public class RotatedBinarySearchDuplicate {
    public static void main(String[] args) {
        int[] myArray = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        System.out.println(answer(myArray, target));
    }

    static boolean search(int[] myArray, int target) {
        int found = searchWithBS(myArray, target);
        return found != -1;
    }

    static int searchWithBS(int[] myArray, int target) {
        int pivot = findPivotWithDuplicates(myArray);
        if (pivot == -1) {
            return BinarySearch(myArray, target, 0, myArray.length - 1);
        }
        if (myArray[pivot] == target) {
            return pivot;
        }
        if (target >= myArray[0]) {
            return BinarySearch(myArray, target, 0, pivot - 1);
        } else {
            return BinarySearch(myArray, target, pivot + 1, myArray.length - 1);
        }
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

    static int findPivotWithDuplicates(int[] myArray) {
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

            if (myArray[mid] == myArray[start] && myArray[mid] == myArray[end]) {
                if (start < end && myArray[start] > myArray[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && myArray[end] < myArray[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (myArray[start] < myArray[mid] || (myArray[start] == myArray[mid] && myArray[mid] > myArray[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
