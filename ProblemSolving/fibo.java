
import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;

        while (n > 1) {
            sum = first + second;  // Correct Fibonacci logic: sum of the last two numbers
            first = second;        // Update first to the current second
            second = sum;          // Update second to the new sum
            n--;                   // Decrease n to continue the loop
        }

        return second;  // Return the final Fibonacci number
    }

}
