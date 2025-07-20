import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class IntersectionofMultipleArrays2248 {
    public static void main(String[] args) {
    //    int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
    //    int[][] nums = {{1,2},{3,4},{5,6}};
       List<Integer> result2 = new ArrayList<>(intersection(nums));
       System.out.println(result2);

       
    }
     static List<Integer> intersection(int[][] nums) {
      int size=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>(); 
       for(int i=0;i<size;i++){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums[i]){
            set.add(num);
        }
       
       for(int num:set){
                map.put(num, map.getOrDefault(num, 0) + 1);
       }
    }
    List<Integer> result = new ArrayList<>();
       for(int key:map.keySet()){
        if(map.get(key)==nums.length){
            result.add(key);
        }
       }
       Collections.sort(result);
      
        return result;
    }
}
