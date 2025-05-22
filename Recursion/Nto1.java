
public class Nto1 {

    public static void main(String[] args) {
        // System.out.println(sum(6));
        concept(6);
    }

    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        concept(--n);
    }
    // static int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n + sum(n-1);
    // }

    // static int factorial(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n * factorial(n-1);
    // }

    // static int factorial(int n) {
    //     int mul = 1;
    //     for (int i = 1; i <= n; i++) {
    //         mul = mul * i;

    //     }
    //     return mul;
    // }
   
}
