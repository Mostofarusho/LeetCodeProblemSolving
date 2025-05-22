
import java.util.Scanner;

public class Person extends Utility {

    public static void main(String[] args) {
        Person obj = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Tool Name");
        Utility.toolName = sc.nextLine();
        System.out.println("Enter Your User Name");
        obj.userName = sc.nextLine();
        Utility.printToolName(obj.userName);
        obj.printUserName();
        obj.printTotal();
    }
}
