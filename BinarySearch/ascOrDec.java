public class ascOrDec {

    public static void main(String[] args) {
        int[] myArray = {99,80,75,22,11,10,5,2,-3 };
        int target = 22;
        int ans = OrderWise(myArray, target);
        System.out.println("This is My   " + ans);
    }

    static int OrderWise(int[] myArray, int target) {
        int start = 0;
        int end = myArray.length - 1;

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