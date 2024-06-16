import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));

    }

    static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersectList = new ArrayList<>();
        boolean[] visited = new boolean[nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j<nums2.length; j++) {
                if (nums1[i] == nums2[j] && !visited[j]) {
                    intersectList.add(nums1[i]);
                    visited[j] = true;
                    break;
                }
            }
        }
        int[] result = new int[intersectList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersectList.get(i);
        }
        return result;

    }
}
