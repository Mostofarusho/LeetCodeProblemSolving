
import java.util.Scanner;

public class digitOccursNumberOffTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        System.out.println(Occurance(n));
    }

    static int Occurance(int n) {
        int check = 7;
        int count=0;
        while (n > 0) {
            int rem=n%10;
            if(rem==check){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
