public class sumOfDigits {
    public static void main(String[] args) {
        int ans=sod(1342);
        System.out.println(ans);
        System.out.println(sodRecursion(1342));
        
    }
    static int sod(int n){
        int sum=0;
        while (n!=0) { 
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    static  int sodRecursion(int n){
        
        if(n==0){
            return 0;
        }
        return n%10+sodRecursion(((n-1)/10));
      
    }
}
