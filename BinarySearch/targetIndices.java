import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndices {
    public static void main(String[] args) {
        int[] myArray = { 1,2,5,2,3 };
        int target = 2;
        int[] ans = targetIndices(myArray, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] targetIndices(int[] myArray, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0)=search(myArray,target,true);
      

        return list;
    }
    public List<Integer> search(int[] myArray, int target, boolean firstStartIndex) {
        
        int list = -1;
        int start = 0;
        int end = myArray.length - 1;
       Arrays.sort(myArray);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > myArray[mid]) {
                start = mid + 1;
            } else if (target < myArray[mid]) {
                end = mid - 1;
            } else {
                list = mid;
                 if(firstStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return list;
    }
}
// 2089. Find Target Indices After Sorting Array
// Easy
// Topics
// Companies
// Hint

// You are given a 0-indexed integer array nums and a target element target.

// A target index is an index i such that nums[i] == target.

// Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.