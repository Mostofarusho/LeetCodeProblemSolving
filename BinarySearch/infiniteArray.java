public class infiniteArray {
    public static void main(String[] args) {
        int[] myArray = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(ans(myArray, target));
    }

    static int ans(int[] myArray, int target) {
        int start = 0;
        int end = 1;
        while (target > myArray[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(myArray, target, start, end);
    }

    static int binarySearch(int[] myArray, int target, int start, int end) {

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
}