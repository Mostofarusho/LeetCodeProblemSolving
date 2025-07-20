
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={0,4,4,1,2,2,4,4,1};
        int ans=mostFrequentEven(nums);
        System.out.println(ans);
        // int[] nums={4,4,4,9,2,4};
        // int[] nums={29,47,21,41,13,37,25,7};
    }
      static int mostFrequentEven(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int size=nums.length;
        
        int i=0;
        while(i!=size){
                if(map.containsKey(nums[i])==false){
                map.put(nums[i], 1);
            }
            else{
                int oldValue=map.get(nums[i]);
                int newValue=oldValue+1;
                map.put(nums[i],newValue);
            }
            
            i++;
        }
        
        int maxValue = Integer.MIN_VALUE;
        int resultKey =  Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> data:map.entrySet()){
            int key=data.getKey();
            int value=data.getValue();
            if(data.getKey()%2==0){
            
            if(data.getValue()>maxValue){
                maxValue=data.getValue();
                resultKey=data.getKey();
            }
            else if(value==maxValue && key<resultKey){
                resultKey=key;
               
            }
            }
            
            
           
         
        
    }
      return (maxValue == Integer.MIN_VALUE) ? -1 : resultKey;
    }
    
}


   
