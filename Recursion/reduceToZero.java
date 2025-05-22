public class reduceToZero {
    public static void main(String[] args) {
        System.out.println(count(41));
    }
    static int count(int n) {
        return helper(n, 0);

    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helper(n/2, count+1);
        }
        else{
            return helper(n-1, count+1);
        }
    }
}

