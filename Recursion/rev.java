
public class rev {

    public static void main(String[] args) {
        System.out.println(reverseDigit(123));
        reverseDigitRecursion(123);
        System.out.println(sum);

    }

    static int reverseDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            // sum=sum*10;
            n = n / 10;
        }
        return sum;
    }
    static int sum=0;

    static void reverseDigitRecursion(int n) {

        if (n == 0) {
            return ;
        }
        
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseDigitRecursion(n / 10);
        

    }

}
