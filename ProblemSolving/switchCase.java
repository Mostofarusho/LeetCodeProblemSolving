
import java.util.Scanner;


public class switchCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Human");
        String human=sc.next();
        switch (human) {
            case "Sanjit":
                System.out.println("Black Diamond");
                break;
            case "Avijit":
                System.out.println("White Diamond");
                break;
            case "Arif":
                System.out.println("Mango Diamond");
                break;
            case "Rayin":
                System.out.println("Potato Diamond");
                break;
            default:
                System.out.println("Doesn't Match");
                break;
        }
    }
}
