public class fact {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
