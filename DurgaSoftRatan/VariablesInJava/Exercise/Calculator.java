import java.util.Scanner;

public class Calculator {

    int num1;
    int num2;

    // Static method for addition
    static int addition(int a, int b) {
        return a + b; // Perform addition of parameters
    }

    // Instance method for multiplication
    int multiplication() {
        return num1 * num2; // Use instance variables directly
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator(); // Create an object of Calculator
        Scanner sc = new Scanner(System.in);

        // Input numbers for multiplication and addition
        System.out.println("Enter Your First Number:");
        obj.num1 = sc.nextInt();
        System.out.println("Enter Your Second Number:");
        obj.num2 = sc.nextInt();

        // Call instance method for multiplication
        int multi = obj.multiplication();
        System.out.println("Multiplication is: " + multi);

        // Call static method for addition using the class name
        int sum = Calculator.addition(obj.num1, obj.num2);
        System.out.println("Addition is: " + sum);
    }
}
