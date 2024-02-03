public class finalValueAfterOperations {
    public static void main(String[] args) {
        String input[]={"--X","X++","X++"};
        int ans=finalValueAfterOperations(input);
        System.out.println(ans);
    }
    static int finalValueAfterOperations(String[] operations){
        int sum=0;
        for(String s:operations){
            if(s.equals("--X") || s.equals("X--")){
                sum=sum-1;
            }
            else if(s.equals("++X") || s.equals("X++")){
                sum=sum+1;
            }
        }
        return sum;
    }
}
