import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class minimum_integer_common {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 6 };
        int[] nums2 = { 2, 3, 4, 5 };
        int ans = getCommon(nums1, nums2);
        System.out.println(ans); // Output should be 2
    }

    static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        boolean found = false;
        int min = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (set2.contains(num)) {
                if (num < min) {
                    min = num;
                }
                found = true;

            }
        }
        return found ? min : -1;
    }
}