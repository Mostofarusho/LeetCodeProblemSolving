import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> ans = findDifference(nums1, nums2);
        System.out.println(ans); // Output: [[1, 3], [4, 6]]
    }

    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>()); // List for nums1 elements not in nums2
        ans.add(new ArrayList<>()); // List for nums2 elements not in nums1

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Populate set1 with elements from nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Populate set2 with elements from nums2
        for (int num : nums2) {
            set2.add(num);
        }

        // Remove elements from set1 that are also in set2
        for (int num : nums2) {
            if (set1.contains(num)) {
                set1.remove(num);
            }
        }

        // Remove elements from set2 that are also in set1
        for (int num : nums1) {
            if (set2.contains(num)) {
                set2.remove(num);
            }
        }

        // Add remaining elements from set1 to the first list in the answer
        ans.get(0).addAll(set1);

        // Add remaining elements from set2 to the second list in the answer
        ans.get(1).addAll(set2);

        return ans;
    }
}
