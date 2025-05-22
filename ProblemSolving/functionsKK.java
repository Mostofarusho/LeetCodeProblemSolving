
import java.util.Scanner;

public class functionsKK {

    int a;
    int b;

     functionsKK(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void addition() {
        
        int result = a + b;

        System.out.println("Result for addition is " + result);

    }

    void add() {
        int result = a + b;
        System.out.println("Result For Instance Block is " + result);
    }

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Result is " + result);

    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = input.nextInt();
        System.out.println("Enter b ");
        int b = input.nextInt();
        // int result=a+b;
        functionsKK obj = new functionsKK(a,b);
        obj.add();
        obj.addition();
        functionsKK.sum(a, b);

    }
}
