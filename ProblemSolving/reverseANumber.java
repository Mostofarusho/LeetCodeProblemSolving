
import java.util.Scanner;

public class reverseANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        System.out.println(isReverse(n));
    }

    static int isReverse(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum*10 + rem;
            n = n / 10;
        }
        return sum;
    }
}
