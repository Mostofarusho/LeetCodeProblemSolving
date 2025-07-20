
import java.util.Arrays;
import java.util.HashSet;


public class ApnaCollegeJavaCourse {
    public static void main(String[] args) {
      
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        int[] ans=intersection(arr1,arr2);
        System.out.println(Arrays.toString(ans));
        
    }
        
     static int[] intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> interSectionSet=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            
            if(set.contains(arr2[j])){
                interSectionSet.add(arr2[j]);
            }
        }
        int[] result=new int[interSectionSet.size()];
        int indexK=0;
        for(int num:interSectionSet){
            result[indexK++]=num;
        }
        return result;
     }
 }
