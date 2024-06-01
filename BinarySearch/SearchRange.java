import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {

        int[] myArray = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] ans = searchRange(myArray, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] myArray, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(myArray, target, true);
        ans[1] = search(myArray, target, false);

        return ans;
    }

    static int search(int[] myArray, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = myArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > myArray[mid]) {
                start = mid + 1;
            } else if (target < myArray[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
