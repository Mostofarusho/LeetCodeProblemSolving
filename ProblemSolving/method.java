
import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        method.add(10, 20);
        int x = 100, y = 200;
        method.add(x, y);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int b = sc.nextInt();
        method.add(a, b);
        // operations op=new operations();
        // op.wish();
        // op.add(10, 20);
        // operations.login("Mostofa", "rusho");
        // operations.courseInfo("Mostofa", "corejava");
        // operations.display(10, 'r', 5.5, true);
    }

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);

    }
}
