
import java.util.Scanner;

public class functionsKKTwo {

    void sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter your First Number = ");
        num1 = input.nextInt();
        System.out.print("Enter Your Second Number = ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("Your Sum is = " + sum);
    }

    public static void main(String[] args) {
        functionsKKTwo obj = new functionsKKTwo();
        int i = 1;
        while (i <= 10) {
            System.out.println("Printing for " + i + " Time");
            obj.sum();
            i++;
        }

    }
}
