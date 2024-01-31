import java.util.Arrays;

public class Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static void main(String[] args) {
        boolean input = areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
        System.out.println(input);
        
    }
    Check_if_All_A's_Appears_Before_All_B's

    static boolean areNumbersAscending(String s) {
        char[] ch = s.toCharArray();
        int size = ch.length;
        int[] result = new int[size];
        int resultIndex = 0; 

       
        for (int i = 0; i < size; i++) {
            StringBuilder numStr = new StringBuilder();
            
            while (i < size && Character.isDigit(ch[i])) {
                numStr.append(ch[i]);
                i++; 
            }
            if (numStr.length() > 0) {
              
                result[resultIndex++] = Integer.parseInt(numStr.toString());
            }
        }

        
         result=Arrays.copyOf(result, resultIndex);
         for(int i=0;i<result.length;i++){
            for(int j=i+1;j<result.length;j++){
                if(result[i]>=result[j]){
                    return false;
                    
                }
                
            }
           
         }
         return true;
    }
}