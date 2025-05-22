
public class palindrom {

    public static void main(String[] args) {
        isPalindrom(267);
        System.out.println(reversePalindrom(267));
        System.out.println(isPali(267));

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
    static boolean isPali(int n){
        return n==reverseDigit(n);
    }
    static void isPalindrom(int n) {
        int digit = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            // sum=sum*10;
            n = n / 10;
        }
        if (digit == sum) {
            System.out.println("Plaindrom");
        } else {
            System.out.println("Not Palindrom");
        }

    }
    static int sum=0;
    static boolean  reversePalindrom(int n){
        int digit = n;
        if(n==0){
            return false;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reversePalindrom(n / 10);
        if(digit==sum){
            return true;
        }
        return false;
    }
}
