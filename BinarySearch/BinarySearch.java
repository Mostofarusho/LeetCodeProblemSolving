package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = { 2, 4, 8, 16, 32, 36, 48, 60, 72, 84 };
        int target = 8;
        int ans = SearchIndex(myArray, target);
        System.out.println("This is My"+ans);
    }

    static int SearchIndex(int[] myArray, int target) {
        int start = 0;
        int end = myArray.length - 1;
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