public class PeakIndex {
    //1095
    public static void main(String[] args) {

    }

    static int search(int[] myArray, int target) {
        int peak = findInMountainArray(myArray);
        int firstTry = OrderWise(myArray, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return OrderWise(myArray, target, peak+1, myArray.length-1)
        }
    }

    static int findInMountainArray(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (myArray[mid] > myArray[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return end;
    }

   static int OrderWise(int[] myArray, int target,int start,int end) {
        
        boolean isAsc = myArray[end] > myArray[start];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == myArray[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target > myArray[mid]) {
                    start = mid + 1;
                } else if (target < myArray[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > myArray[mid]) {
                    end = mid - 1;
                } else if (target < myArray[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
// 1095